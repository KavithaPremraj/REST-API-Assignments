package day1RestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident {

	@Test
	public  void getAllIncident() {
		RestAssured.baseURI ="https://dev141463.service-now.com/api/now/table/incident/0c5b4a4997d0611051a87f200153aff5";
		RestAssured.authentication = RestAssured.basic("admin", "Kavin@912");
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "  \"company\": \"Testleaf\",\r\n"
				+ "   \"description\": \"updating using PUT Method the incident\",\r\n"
				+ "    \"short_description\": \"Application is not working when i installed\" \r\n"
				+ "}");
		Response response = inputRequest.put();
		response.prettyPrint();
		
		
	}
}