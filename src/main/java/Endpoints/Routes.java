package Endpoints;

public class Routes {
	
	public static String base_url = "http://localhost:8080";
	
	//USER MODEL
	public static String get_user_url = base_url+"/api/user/getUser/{userID}";

	//CATEGORY MODEL
	public static String get_cat_url = base_url+"/api/category/{categoryID}";
	public static String post_cat_url = base_url+"/api/category/addCategory/{categoryName}";
	public static String update_cat_url = base_url+"/api/category/updateCategory";
	public static String delete_cat_url = base_url+"/api/category/deleteCategoryById/{categoryID}";
	
	//PRODUCT MODEL
	public static String get_prod_url = base_url+"/api/product/viewSingleProduct/";
	public static String post_prod_url = base_url+"/api/product/addProduct/";
	public static String update_prod_url = base_url+"/api/product/updateMapping/";
	public static String del_prod_url = base_url+"/api/product/deleteProductById/";
}
