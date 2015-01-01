/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class Prefix {

	private String prefix;
	private String[] array;
	
	private String arrayToString() {
		String stringArray = "";
		for (int i = 0; i < array.length; i++) {
			stringArray += " " + array[i];
		}
		return stringArray;
	}
	
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
	
	@Override
	public String toString() {
		return "Prefix [prefix = " + prefix + ", array = " + arrayToString() + "]";
	}
}
