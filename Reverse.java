/*
 * File: Reverse.java
 * -------------------------------
 * This class reverses strings from the API.
 */

import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
import com.google.gson.GsonBuilder;


public class Reverse {
	
	public Reverse(String input) {
		target = input;
	}
	
	public String reverseString() {
		StringBuffer sb = new StringBuffer(target);
		String reversed = sb.reverse().toString();
		return reversed;
	}
	
	/**private instance variables**/
	private String target;
	
}
