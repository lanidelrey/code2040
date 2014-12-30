/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 */

import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.GsonBuilder;


public class Register {
	
	public static void main(String[] args) throws IOException {
		// Challenge 0: registration, get token
		String regUrl = ""
		String response = register.getJson(registrationMap());
		strip(response);
		
		// Challenge 1: reverse string
		register.reverseString();
	}
	
	private static Map registrationMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("email", "leilani3@stanford.edu");
		map.put("github", "https://github.com/lanidelrey/code2040");
		return map;
	}
	
	private static Map tokenMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("token", token);
		return map;
	}
	
	private static Map stringMap(String string) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("token", token);
		map.put("string", string);
		return map;
	}
	
	private void reverseString() throws IOException {
		String input = register.getJson(tokenMap());
		Reverse reverse = new Reverse(input);
		String reversed = reverse.reverseString();
		String response = register.getJson(stringMap(reversed));
		System.out.println(response);
	}
	
	private String getJson(String url, Map map) throws IOException {
		String json = new GsonBuilder().create().toJson(map, Map.class);
		String response = makeRequest("http://challenge.code2040.org/api/register", json);
		return response;
	}
	
	private String makeRequest(String url, String json) throws IOException {
		System.out.println("sending http POST request");
		URL obj = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		
		//send request
		DataOutputStream ds = new DataOutputStream(connection.getOutputStream());
		ds.writeBytes(json);
		ds.flush();
		ds.close();
		
		//get response
		InputStream is = connection.getInputStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		String line = "";
		String response = "";
		while ((line = rd.readLine()) != null) {
			response += line;
		}
		rd.close();
		
		System.out.println(response);
		
		return response;
	}
	
	private static void strip(String response) {
		int index = response.indexOf(":\"") + 2;
		int end = response.length() - 2;
		
		for(int i = index; i < end; i++) {
			token += response.charAt(i);
		}
		
		System.out.println(token);
	}
	
	/**private instance variables**/
	private static Register register = new Register();
	private static String token = "";
}
