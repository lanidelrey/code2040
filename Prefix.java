/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	private String prefix;
	private String[] array;
	
	public String getPrefix() {
		return prefix;
	}
	
	public String[] getArray() {
		return array;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public void setArray(String[] array) {
		this.array = array;
	}
	
	public String toString() {
		return "Prefix [prefix = " + prefix + ", array = " + array + "]";
	}
}
