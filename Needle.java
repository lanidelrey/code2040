/*
 * File: Needle.java
 * -------------------------------
 * This class finds the needle in the haystack.
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
	
	private int getNeedleIndex(String input) {
		return haystack.indexOf(needle);
	}
}
