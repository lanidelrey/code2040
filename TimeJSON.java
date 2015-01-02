/*
 * File: TimeJSON.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import java.util.*;

public class TimeJSON {
	
	private Time result;
	
	public Time getResult() {
		return result;
	}
	
	public String getAnswer() {
		return result.addInterval();
	}
	
	@Override
	public String toString() {
		return "TimeJSON [result = " + result + "]";
	}
}
