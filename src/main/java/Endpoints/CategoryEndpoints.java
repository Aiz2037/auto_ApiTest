package Endpoints;

import static io.restassured.RestAssured.given;

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

}
