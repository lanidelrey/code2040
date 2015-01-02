/*
 * File: TimeJSON.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

public class TimeJSON {
	
	/**private instance variables**/
	private Time result;
	
	/**public methods**/
	public Time getResult() {
		return result;
	}
	
	// sum of given interval and given datestamp
	public String getAnswer() {
		return result.addInterval();
	}
	
	@Override
	public String toString() {
		return "TimeJSON [result = " + result + "]";
	}
}
