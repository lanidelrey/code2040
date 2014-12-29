/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 */

import java.io.*;
import java.net.*;
import java.lang.*;

public class Register {
	
	public static void main(String[] args) throws IOException {
		Register register = new Register();
		register.sendGet();
		register.sendPost();
	}

	private void sendGet() throws IOException {
		System.out.println("sending http GET request");
		
		String url = "http://challenge.code2040.org/api/register";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
	}
	
	private void sendPost() throws IOException {
		System.out.println("sending http POST request");
	}
	
	/**private instance variables**/
	private String token;
	private static final String USER_AGENT = "Mozilla/5.0";

}
