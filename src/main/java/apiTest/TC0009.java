package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.ProductEndpoints;
import io.restassured.response.Response;

public class TC0009 {
	
	@Test
	public void testDeleteProductById() {
		Response res = ProductEndpoints.deleteProductById(3);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	

}
