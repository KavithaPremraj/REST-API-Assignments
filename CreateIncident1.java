package day1RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident1 {
	
	@Test
	public void create()
	{
		//5 step procees:
		// req doc
		//Endpoint& Auth
		RestAssured.baseURI = "https://dev141463.service-now.com/api/now/table/incident/eb33b6d59710211051a87f200153af09";
		RestAssured.authentication = RestAssured.basic("admin", "Kavin@912");
		
		//Add req,post
		RequestSpecification inputreq = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"Windows is not supporting\",\r\n"
				+ "    \"short_description\": \"Windows is not supporting with OS\"\r\n"
				+ "}");
		
		//send req
		Response resp = inputreq.post();
		// response
		resp.prettyPrint();
	}

}
