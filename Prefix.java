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
	
	public void searchPrefixes() {
		int noPrefixCount = 0;
		ArrayList<String> noPrefixes = new ArrayList<String>();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(prefix) == false) {
				noPrefixCount++;
				noPrefixes.add(array[i]);
			}
		}
		
		setFinalArray(noPrefixCount, noPrefixes);
	}
	
	private void setFinalArray(int count, ArrayList<String> words) {
		
	}
	
	@Override
	public String toString() {
		return "Prefix [prefix = " + prefix + ", array = " + arrayToString() + "]";
	}
}
