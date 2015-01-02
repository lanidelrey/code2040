/*
 * File: Time.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import org.joda.time.*;

public class Time {
	
	private String datestamp;
	private String interval;
	
	public String addInterval() {
		DateTime date = new DateTime(datestamp);
		int inter = Integer.parseInt(interval);
		DateTime newDate = date.plusSeconds(inter);
		
		System.out.println("datestamp: " + date.toString());
		System.out.println("interval: " + inter);
		System.out.println("new: " + newDate.toString());
		
		return newDate.toString();
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
