package day1RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentWithQueryParam {
	@Test
	public void getIncQeryParam()
	{
		RestAssured.baseURI="https://dev141463.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin","Kavin@912");
		RequestSpecification inputReq = RestAssured.given().queryParam("sysparm_fields", "sys_id,number")
				.queryParam("sysparm_limit", "2");
		Response response = inputReq.get();
		response.prettyPrint();
		
		
	}

}
