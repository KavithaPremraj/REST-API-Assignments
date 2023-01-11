package day1RestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {

	@Test
	public  void getAllIncident() {
		
		//1.Req Doc
		//2.Endpoint
		RestAssured.baseURI="https://dev141463.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin","Kavin@912");
		//3.Construct
		RequestSpecification inputReq = RestAssured.given().contentType("application/json");
				Response response = inputReq.post();
				//response.path("", null)
				response.prettyPrint();
		ValidatableResponse statusCode2 = response.then().assertThat().statusLine("HTTP/1.1 201 Created");
		System.out.println(statusCode2);
	}
}