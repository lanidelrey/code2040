/*
 * File: Token.java
 * -------------------------------
 * This class deserializes JSON result to obtain token.
 */

public class Token {
	
	/**private instance variables**/
	private String result;
	
	/**public methods**/
	public String getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return "Token [result = " + result + "]";
	}
}
