package apiTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.UserEndpoint;
import io.restassured.response.Response;

public class TC0001 {
	
	@Test
	public void testGetUserById() {
		
		Response res = UserEndpoint.getUser(1);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String firstname = res.jsonPath().get("data.firstname").toString();
		String lastname = res.jsonPath().get("data.lastname").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(firstname, "Ahmad");
		Assert.assertEquals(lastname, "Ansar");
		
	}
}
