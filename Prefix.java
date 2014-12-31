/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	public Prefix() {
		prefix = "";
		array = new String[6];
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public String[] getWords() {
		return array;
	}
	
	/**public instance variables**/
	public String prefix;
	public String[] array;
}
