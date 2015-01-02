/*
 * File: Time.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import java.util.*;

public class Time {
	
	private String datestamp;
	private String interval;
	
	public String getDatestamp() {
		return datestamp;
	}
	
	public String getInterval() {
		return interval;
	}
	
	public String[] getFinalArray() {
		return result.searchPrefixes();
	}
	
	@Override
	public String toString() {
		return "PrefixJSON [result = " + result + "]";
	}
}
