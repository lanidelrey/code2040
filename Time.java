/*
 * File: Time.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import org.joda.time.*;

public class Time {
	
	private String datestamp;
	private String interval;
	
	private void makeJoda() {
		DateTime date = new DateTime(datestamp);
		DateTime interval = new DateTime(interval);
	}
	
	public String getDatestamp() {
		return datestamp;
	}
	
	public String getInterval() {
		return interval;
	}
	
	@Override
	public String toString() {
		return "Time [datestamp = " + datestamp + ", interval = " + interval + "]";
	}
}
