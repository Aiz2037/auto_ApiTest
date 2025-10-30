package Endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.remote.RemoteWebDriver.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class UserEndpoint {
	
	public static Response getUser(Integer userID) { //pass user ID as string
		
		Response res = 
				given()
					.pathParam("userID", userID)
				.when()
					.get(Routes.get_user_url);
		return res;
		
	}
	
}
