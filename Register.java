/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 */

import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.text.AbstractDocument.Content;

import com.google.gson.GsonBuilder;


public class Register {
	
	public static void main(String[] args) throws IOException {
		Register register = new Register();
//		register.sendGet();
		register.sendPost(getJson());
	}

//	private void sendGet() throws IOException {
//		System.out.println("sending http GET request");
//		
//		String url = "http://challenge.code2040.org/api/register";
//		URL obj = new URL(url);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//		
//		con.setRequestMethod("GET");	// optional, since default is "GET" request
//		con.setRequestProperty("User-Agent", USER_AGENT);
//		
//		int responseCode = con.getResponseCode();
//		System.out.println("Sending 'GET' request to URL: " + url);
//		System.out.println("Response code: " + responseCode);
//		
//		BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
//		String input;
//		StringBuffer response = new StringBuffer();
//		
//		while ((input = rd.readLine()) != null) {
//			response.append(input);
//		}
//		
//		rd.close();
//		
//		System.out.println(response.toString());
//	}

	private static String getJson() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("email", "leilani3@stanford.edu");
		map.put("github", "https://github.com/lanidelrey/code2040");
		String json = new GsonBuilder().create().toJson(map, Map.class);
		return json;
	}
	
	private void sendPost(String content) throws IOException {
		System.out.println("sending http POST request");
		
		String url = "http://challenge.code2040.org/api/register";
		URL obj = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
	}
	
	/**private instance variables**/
	private String token = "";
	private static final String USER_AGENT = "Mozilla/5.0";

}
