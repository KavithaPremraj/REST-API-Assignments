package day1RestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class DeleteIncident {

	@Test
	public  void getIncident() {
		
		//1.Req Doc
		//2.Endpoint
		RestAssured.baseURI="https://dev141463.service-now.com/api/now/table/incident/eb33b6d59710211051a87f200153af09";
		RestAssured.authentication = RestAssured.basic("admin","Kavin@912");
		//3.Construct
		RequestSpecification inputReq = RestAssured.given();
		//4.Send the Request
		Response response = inputReq.delete();
		//5.validate the response
	 response.prettyPrint();
		

	}

}
