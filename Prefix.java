/*
 * File: Prefix.java
 * -------------------------------
 * This class stores deserialized JSON data for the prefix challenge.
 */

import java.util.*;	// allows use of ArrayLists

public class Prefix {

	/**private instance variables**/
	private String prefix;
	private String[] array;
	
	/**private methods**/
	// converts array to string, helps toString()
	private String arrayToString() {
		String stringArray = "";
		for (int i = 0; i < array.length; i++) {
			stringArray += " " + array[i];
		}
		return stringArray;
	}
	
	// converts below ArrayList to array only of words w/o prefixes
	private String[] setFinalArray(int count, ArrayList<String> words) {
		String[] finalArray = new String[count];
		
		for (int i = 0; i < count; i++) {
			finalArray[i] = words.get(i);
		}
		
		return finalArray;
	}
	
	
	/**public methods**/
	public String getPrefix() {
		return prefix;
	}
	
	public String[] getArray() {
		return array;
	}
	
	// adds words w/o prefix to ArrayList, reference above
	public String[] searchPrefixes() {
		int noPrefixCount = 0;
		ArrayList<String> noPrefixes = new ArrayList<String>();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(prefix) == false) {
				noPrefixCount++;
				noPrefixes.add(array[i]);
			}
		}
		
		return setFinalArray(noPrefixCount, noPrefixes);
	}
	
	@Override
	public String toString() {
		return "Prefix [prefix = " + prefix + ", array = " + arrayToString() + "]";
	}
}
