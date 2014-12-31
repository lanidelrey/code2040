/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	public Prefix(String input) {
		prefix = getPrefix(input);
		array = getWords(input);
	}
	
	public String getPrefix(String input) {
		String key = "\"prefix\":\"";
		int keyLength = key.length();
		
		for (int i = input.indexOf(key) + keyLength; i < input.indexOf("\"}}"); i++) {
			prefix += input.charAt(i);
		}
		
		System.out.println("prefix: " + prefix);
		return prefix;
	}
	
	public String[] getWords(String input) {
		int index1 = input.indexOf("[");
		int index2 = input.indexOf("]");
		String rawWords = "";
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(int i = index1 + 1; i < index2; i++) {
			rawWords += input.charAt(i);
		}
		
		StringTokenizer tokenizer = new StringTokenizer(rawWords, " ,\"");
		while (tokenizer.hasMoreTokens()) {
			arrayList.add(tokenizer.nextToken());
		}
		
		array = new String[arrayList.size()];
		for (int j = 0; j < arrayList.size(); j++) {
			array[j] = arrayList.get(j);
		}
		
		return array;
	}
	
	/**public instance variables**/
	public String prefix;
	public String[] array;
}
