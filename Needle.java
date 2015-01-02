/*
 * File: Needle.java
 * -------------------------------
 * This class deserializes data of JSON result.
 */
public class Needle {
	
	/**private instance variables**/
	private String[] haystack;
	private String needle;
	
	/**public methods**/
	public String getNeedle() {
		return needle;
	}
	
	public String[] getHaystack() {
		return haystack;
	}
	
	// finds index of needle in haystack
	public int getNeedleIndex() {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i].equals(needle)) {
				return i;
			}
		}
		return -1;	// -1 to signify absence of needle in haystack
	}
}
