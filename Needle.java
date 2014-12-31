/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
 */

import java.util.*;

public class Needle {
	
	public Needle(String input) {
		haystack = pullArray(input);
		needle = pullString(input);
	}
	
	public int getNeedleIndex() {
		StringBuffer sb = new StringBuffer("");
		//make into an array, find index
		return 0;
	}
	
	private ArrayList<String> pullArray(String input) {
		int index = input.indexOf("\"haystack\":");
		return haystack;
	}
	
	private String pullString(String input) {
		return "";
	}
	
	/**private instance variables**/
	private ArrayList<String> haystack;
	private String needle;
	
}
