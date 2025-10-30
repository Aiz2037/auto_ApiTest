package Endpoints;

public class Routes {
	
	public static String base_url = "http://localhost:8080";
	
	//USER MODEL
	public static String get_user_url = base_url+"/api/user/getUser/{userID}";

	//CATEGORY MODEL
	public static String get_cat_url = base_url+"/api/category/{categoryID}";
	
}
