package Endpoints;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.response.Response;

public class CategoryEndpoints {
	
	public static Response getCategory(Integer categoryID) {
		Response res = 
				given()
					.pathParam("categoryID", categoryID)
				.when()
					.get(Routes.get_cat_url);
		return res;
	}
	
	public static Response newCategory(String categoryName) {
		
		Response res = 
				given()
				.pathParam("categoryName", categoryName)
					
				.when()
					.post(Routes.post_cat_url);
		return res;
	}
	
	public static Response UpdateCategory(Integer id, String categoryName) {

		Response res = 
				given()
				.param("categoryID", id)
				.param("updatecategoryName", categoryName)
				
				.when()
					.put(Routes.update_cat_url);
		return res;
	}
	
	public static Response deleteCategory(Integer id) {

		Response res = 
				given()
				
				.pathParam("categoryID",id)
				
				.when()
					.delete(Routes.delete_cat_url);
		return res;
	}
}
