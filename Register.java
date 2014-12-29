/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 */

import java.io.*;
import java.net.*;

public class Register {
	
	public void main(String[] args) {
		Register register = new Register();
		register.sendGet();
		register.sendPost();
	}

	private void sendGet() {
		System.out.println("sending http GET request");
		
		String url = "http://challenge.code2040.org/api/register";
		/*URL obj = new URL(url);
		HttpURLConnection con = */
		
	}
	
	private void sendPost() {
		System.out.println("sending http POST request");
	}
	
	/**private instance variables**/
	private String token;

}
