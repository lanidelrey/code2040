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
		return haystack.indexOf(needle);
	}
}
