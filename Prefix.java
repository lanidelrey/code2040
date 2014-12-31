/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	public Prefix() {
		prefix = "";
		array = new ArrayList<String>();
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public ArrayList<String> getWords() {
		return array;
	}
	
	/**public instance variables**/
	public String prefix;
	public ArrayList<String> array;
}
