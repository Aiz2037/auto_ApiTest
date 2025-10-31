package apiTest;

import java.math.BigDecimal;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.ProductEndpoints;
import Payload.ProductRequest;
import io.restassured.response.Response;

public class TC0007 {
	
	@Test
	public void testCreateProduct() {
		ProductRequest payload = new ProductRequest();
		payload.setName("Working laptop");
		payload.setPrice("234.55");
		payload.setBrand("Acer");
		payload.setInventory("20");
		HashMap <String, String> category = new HashMap<String,String>();
		category.put("name", "Laptop");
		payload.setCategory(category);
		
		Response res = ProductEndpoints.createProduct(payload);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String productName= res.jsonPath().get("data.name").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(productName, "Working laptop");
	}
}
