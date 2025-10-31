package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.ProductEndpoints;
import io.restassured.response.Response;

public class TC0006 {
	@Test
	public void testGetProductById() {
		
		Response res = ProductEndpoints.getProductById(1);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String productName = res.jsonPath().get("data.name").toString();
		String brandName = res.jsonPath().get("data.brand").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(productName, "Sport shoes");
		Assert.assertEquals(brandName, "Asics");
		
		
	}

}
