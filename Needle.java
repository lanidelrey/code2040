/*
 * File: Needle.java
 * -------------------------------
 * This class deserializes data of JSON result.
 */

import java.util.*;

public class Needle {
	
	private String[] haystack;
	private String needle;
	
	public String getNeedle() {
		return needle;
	}
	
	public String[] getHaystack() {
		return haystack;
	}
	
	public int getNeedleIndex() {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i].equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
