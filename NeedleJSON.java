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
	
	public int getIndex() {
		result.getNeedleIndex();
	}
	
	@Override
	public String toString() {
		return "NeedleJSON [result = " + result.toString() + "]";
	}
}
