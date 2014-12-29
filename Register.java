/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 */

import java.io.*;
import java.net.*;

public class Register {
	
	public void run() {
		sendGet();
		sendPost();
	}

	private void sendGet() {
		System.out.println("sending http GET request");
		
	}
	
	private void sendPost() {
		System.out.println("sending http POST request");
	}
	
	/**private instance variables**/
	private String token;

}
