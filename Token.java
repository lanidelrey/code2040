/*
 * File: Token.java
 * -------------------------------
 * This class deserializes JSON result to obtain token.
 */

public class Token {
	
	private String result;
	
	public String getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return "Token [result = " + result + "]";
	}
}
