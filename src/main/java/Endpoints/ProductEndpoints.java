package Endpoints;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.remote.RemoteWebDriver.When;

import Payload.ProductRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProductEndpoints {

	public static Response getProductById(Integer productID) {
		Response res = given().param("productID", productID).when().get(Routes.get_prod_url);
		return res;
	}

	public static Response createProduct(ProductRequest payload) {
		Response res = given()
				.contentType(ContentType.JSON) 
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.post_prod_url);
		return res;
	}

	public static Response updateProduct(ProductRequest payload, Integer productID) {
		Response res = 
				given()
					.param("productID", productID)
					.contentType(ContentType.JSON) 
					.accept(ContentType.JSON)
					.body(payload)
				.when()
					.put(Routes.update_prod_url);
		return res;
	}
	
	public static Response deleteProductById(Integer productID) {
		Response res = given().param("productID", productID).when().delete(Routes.del_prod_url);
		return res;
	}
}
