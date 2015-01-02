/*
 * File: NeedleJSON.java
 * -------------------------------
 * This class defines deserialized JSON result.
 */

public class NeedleJSON {
	
	/**private instance variables**/
	private Needle result;
	
	/**public methods**/
	public Needle getResult() {
		return result;
	}
	
	public int getIndex() {
		return result.getNeedleIndex();
	}
	
	@Override
	public String toString() {
		return "NeedleJSON [result = " + result.toString() + "]";
	}
}
