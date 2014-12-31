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
		
		System.out.println("haystack arrayList: " + haystack);
	}
	
	public int getNeedleIndex() {
		StringBuffer sb = new StringBuffer("");
		//make into an array, find index
		return 0;
	}
	
	private ArrayList<String> pullArray(String input) {
		int index1 = input.indexOf("[");
		int index2 = input.indexOf("]");
		String hayString = "";
		
		for (int i = index1 + 1; i < index2; i++) {
			hayString += input.charAt(i);
		}
		
		StringTokenizer tokenizer = new StringTokenizer(hayString, " ,\"");
		while (tokenizer.hasMoreTokens()) {
			haystack.add(tokenizer.nextToken());
		}
		
		return haystack;
	}
	
	private String pullString(String input) {
		String key = "\"needle\":\"";
		int keyLength = key.length();
		int index = input.indexOf("\"needle\":\"");
		
		return "";
	}
	
	/**private instance variables**/
	private ArrayList<String> haystack = new ArrayList<String>();
	private String needle;
	
}
