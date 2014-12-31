/*
 * File: InnerJSONJavaObj.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

public class InnerJSONJavaObj {

	public InnerJSONJavaObj() {
		prefix = "";
		array = new String[6];
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public String[] getArray() {
		return array;
	}
	
	/**public instance variables**/
	public String prefix;
	public String[] array;
	
	/****/
}
