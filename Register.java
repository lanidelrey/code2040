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

	private void getJson() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("email", "leilani3@stanford.edu");
		map.put("github", "https://github.com/lanidelrey/code2040");
		String json = new GsonBuilder().create().toJson(map, Map.class);
		try {
			makeRequest("http://challenge.code2040.org/api/register", json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void makeRequest(String url, String json) throws IOException {
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
		while ((line = rd.readLine()) != null) {
			token += line;
		}
		rd.close();
		
		System.out.println(token);
	}
	
	/**private instance variables**/
	private String token = "";
	private static final String USER_AGENT = "Mozilla/5.0";

}
