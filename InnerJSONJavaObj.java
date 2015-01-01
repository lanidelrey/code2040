import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * File: InnerJSONJavaObj.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 * referred to http://goo.gl/Y8I0R9 
 */

public class InnerJSONJavaObj {

	public static final <T> T getFromJSON(String json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}
	
	public static final <T> String toJSON(T clazz) {
		return gson.toJson(clazz);
	}
	
	/**private instance variables**/
	private static Gson gson = new GsonBuilder().create();
}
