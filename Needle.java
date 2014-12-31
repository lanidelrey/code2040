/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
 */

public class Needle {
	
	public Needle(String input) {
		haystack = pullArray(input);
		needle = pullString(input);
	}
	
	public int getNeedleIndex() {
		StringBuffer sb = new StringBuffer(haystack);
		//make into an array, find index
		return 0;
	}
	
	private String pullArray(String input) {
		return "";
	}
	
	private String pullString(String input) {
		return "";
	}
	
	/**private instance variables**/
	private String haystack;
	private String needle;
	
}
