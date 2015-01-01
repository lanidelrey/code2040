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
	
	@Override
	public String toString() {
		return "PrefixJSON [result = " + result + "]";
	}
}
