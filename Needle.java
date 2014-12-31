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
		System.out.println("needle: " + needle);
	}
	
	public int getNeedleIndex() {
		return haystack.indexOf(needle);
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
		int index1 = input.indexOf("\"needle\":\"");
		int index2 = input.indexOf("\"}}");
		
		for (int i = index1 + keyLength; i < index2; i++) {
			needle += input.charAt(i);
		}
		
		return needle;
	}
	
	/**private instance variables**/
	private ArrayList<String> haystack = new ArrayList<String>();
	private String needle = "";
	private int index = 0;
}
