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
	
	/**public instance variables**/
	public String prefix;
	public ArrayList<String> words;
}
