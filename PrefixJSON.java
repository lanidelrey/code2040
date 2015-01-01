/*
 * File: PrefixJSON.java
 * -------------------------------
 * This class defines deserialized JSON data for the prefix challenge.
 */

import java.util.*;

public class PrefixJSON {
	
	private Prefix result;
	
	public Prefix getResult() {
		return result;
	}
	
	public void setPrefixJSON(Prefix prefix) {
		this.result = prefix;
	}
	
	public String[] getFinalArray() {
		return result.searchPrefixes();
	}
	
	@Override
	public String toString() {
		return "PrefixJSON [result = " + result + "]";
	}
}
