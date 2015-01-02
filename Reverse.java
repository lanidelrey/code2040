/*
 * File: Reverse.java
 * -------------------------------
 * This class reverses strings from the API.
 */

public class Reverse {
	
	/**private instance variables**/
	private String result;
	
	/**public methods**/
	public String getResult() {
		return result;
	}
	
	public String reverseString() {
		StringBuffer sb = new StringBuffer(getResult());	// facilitates string reversal
		String reversed = sb.reverse().toString();
		System.out.println("original: " + sb);
		System.out.println("reversed: " + reversed);
		return reversed;
	}
	
	@Override
	public String toString() {
		return "Reverse [result = " + result + "]";
	}
}
