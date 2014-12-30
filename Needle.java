/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
 */

public class Needle {
	
	public Reverse(String input) {
		target = input;
	}
	
	public String reverseString() {
		StringBuffer sb = new StringBuffer(target);
		String reversed = sb.reverse().toString();
		return reversed;
	}
	
	/**private instance variables**/
	private String target;
	
}
