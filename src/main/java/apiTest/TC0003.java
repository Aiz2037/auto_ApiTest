package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CategoryEndpoints;
import io.restassured.response.Response;

public class TC0003 {

	@Test
	public void testPostCategory() {
		Response res = CategoryEndpoints.newCategory("Vegetable");
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String categoryName = res.jsonPath().get("data.name").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(categoryName, "Vegetable");
	}
	
}
