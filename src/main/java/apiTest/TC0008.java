package apiTest;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.ProductEndpoints;
import Payload.ProductRequest;
import io.restassured.response.Response;

public class TC0008 {
	
	@Test
	public void testUpdateProductBrand() {
		ProductRequest payload = new ProductRequest();
		payload.setName("Working laptop");
		payload.setPrice("234.55");
		payload.setBrand("Asus");
		payload.setInventory("20");
		HashMap <String, String> category = new HashMap<String,String>();
		category.put("name", "Laptop");
		payload.setCategory(category);
		
		Response res = ProductEndpoints.updateProduct(payload, 6);
		res.then().log().all();
		
		Integer statusCode = res.getStatusCode();
		String brandName= res.jsonPath().get("data.brand").toString();
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(brandName, "Asus");
	}
}
