package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CategoryEndpoints;
import io.restassured.response.Response;

public class TC0002 {
	
	@Test
	public void testGetCategoryById() {
		Response res = CategoryEndpoints.getCategory(1);
		
		Integer statusCode = res.getStatusCode();
		String categoryName = res.jsonPath().get("data.name").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(categoryName, "Shoes");
	}

}
