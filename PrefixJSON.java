/*
 * File: PrefixJSON.java
 * -------------------------------
 * This class defines deserialized JSON data for the prefix challenge.
 */

public class PrefixJSON {
	
	/**private instance variables**/
	private Prefix result;
	
	/**public methods**/
	public Prefix getResult() {
		return result;
	}
	
	public void setPrefixJSON(Prefix prefix) {
		this.result = prefix;
	}
	
	// creates array only of strings w/o prefix
	public String[] getFinalArray() {
		return result.searchPrefixes();
	}
	
	@Override
	public String toString() {
		return "PrefixJSON [result = " + result + "]";
	}
}
