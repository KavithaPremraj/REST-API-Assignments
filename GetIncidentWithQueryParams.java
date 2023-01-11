package day1RestAssured;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentWithQueryParams {
	@Test
	public void getIncQeryParam()
	{
		RestAssured.baseURI="https://dev141463.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin","Kavin@912");
		Map<String,String> queryMap = new HashMap<String,String>();
		queryMap.put("sysparm_fields", "sys_id,number");
		RequestSpecification inputReq = RestAssured.given().queryParams(queryMap);
		Response response = inputReq.get();
		response.prettyPrint();
		
	}

}
