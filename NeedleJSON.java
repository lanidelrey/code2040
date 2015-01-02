/*
 * File: NeedleJSON.java
 * -------------------------------
 * This class defines deserialized JSON result.
 */

import java.util.*;

public class NeedleJSON {
	
	private Needle result;
	
	public Needle getResult() {
		return result;
	}
	
//	private int getNeedleIndex(String input) {
//		return haystack.indexOf(needle);
//	}
	
	@Override
	public String toString() {
		return "NeedleJSON [result = " + result.toString() + "]";
	}
}
