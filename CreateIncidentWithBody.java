package day1RestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithBody {

	@Test
	public  void getAllIncident() {
		
		//1.Req Doc
		//2.Endpoint
		RestAssured.baseURI="https://dev141463.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin","Kavin@912");
		//3.Construct
		RequestSpecification inputReq = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"Windows is not supporting\",\r\n"
				+ "    \"short_description\": \"Windows is not supporting with OS\"\r\n"
				+ "}");
				Response response = inputReq.post();
				//int statusCode = response.getStatusCode();
				//System.out.println("StatusCode is: " +statusCode);
				response.prettyPrint();
		//Validate the response
			ValidatableResponse statusCode2 = response.then().assertThat().statusCode(200);
			System.out.println(statusCode2);
	}
}