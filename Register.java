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
		register.getJson();
	}

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
		String response = "";
		while ((line = rd.readLine()) != null) {
			response += line;
		}
		rd.close();
		
		System.out.println(response);
		strip(response);
	}
	
	private void strip(String response) {
		int index = response.indexOf(":\"") + 2;
		int end = response.length() - 2;
		
		for(int i = index; i < end; i++) {
			token += response.charAt(i);
		}
		
		System.out.println(token);
	}
	
	/**private instance variables**/
	private String token = "";
}
