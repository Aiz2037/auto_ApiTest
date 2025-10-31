package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CategoryEndpoints;
import io.restassured.response.Response;

public class TC0005 {
	@Test
	public void testDeleteCategoryById() {
		Response res = CategoryEndpoints.deleteCategory(4);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String id = res.jsonPath().getString("data.id").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(id, "4");
	
	}
	
}
