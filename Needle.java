/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
 */

public class Needle {
	
	public Needle(String input) {
		haystack = input;
	}
	
	public int getNeedleIndex() {
		StringBuffer sb = new StringBuffer(haystack);
		String reversed = sb.reverse().toString();
		return reversed;
	}
	
	/**private instance variables**/
	private String haystack;
	
}
