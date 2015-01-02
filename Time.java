/*
 * File: Time.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import org.joda.time.*;	// facilitates ISO format handling

public class Time {
	
	/**private instance variables**/
	private String datestamp;
	private String interval;
	
	/**public methods**/
	public String addInterval() {
		DateTime date = new DateTime(datestamp);
		int inter = Integer.parseInt(interval);
		DateTime newDate = date.plusSeconds(inter);	// sum of interval and datestamp
		
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
