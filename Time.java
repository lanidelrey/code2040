/*
 * File: Time.java
 * -------------------------------
 * This class defines deserialized JSON data for the datestamp challenge.
 */

import javax.xml.datatype.XMLGregorianCalendar;

public class Time {
	
	private String datestamp;
	private String interval;
	
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
