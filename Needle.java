/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
 */

import java.util.*;

public class Needle {

	public Needle(String token, String input) {
		this.token = token;
		needle = getNeedleIndex(input);
	}
	
	public String getToken() {
		return token;
	}
	
	public int getIndex() {
		return needle;
	}
	
	private int getNeedleIndex(String input) {
		return array.indexOf(needle);
	}
	
	
	/**public instance variables**/
	public int needle = -1;
	public String token = "";
}
