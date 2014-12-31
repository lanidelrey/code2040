/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	public Prefix() {
		prefix = "";
		words = new ArrayList<String>();
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public ArrayList<String> getWords() {
		return words;
	}
	
	/**public instance variables**/
	public String prefix;
	public ArrayList<String> words;
}
