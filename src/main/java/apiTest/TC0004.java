package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CategoryEndpoints;
import io.restassured.response.Response;

public class TC0004 {
	
	@Test
	public void testUpdateCategoryName() {
		Response res = CategoryEndpoints.UpdateCategory(1, "T shirt");
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String id = res.jsonPath().getString("data.id").toString();
		String categoryName = res.jsonPath().get("data.name").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(id, "1");
		Assert.assertEquals(categoryName, "T shirt");
	}
	
	
}
