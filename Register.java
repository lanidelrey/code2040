/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 * It also completes subsequent challenges by calling instances of other classes.
 */

import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;

public class Register {
	
	public static void main(String[] args) throws IOException {
		// Challenge 0: registration, get token
		String regUrl = "http://challenge.code2040.org/api/register";
		token = register.strip(register.getJson(regUrl, registrationMap()));
		
		// Challenge 1: reverse string
		register.reverseString();
		
		// Challenge 2: find needle
		register.sendIndex();
		
		// Challenge 3: find non-prefixed words
		register.deserializePrefix();
	}
	
	/**general JSON methods**/
	private String getJson(String url, Map map) throws IOException {
		String json = new GsonBuilder().create().toJson(map, Map.class);
		String response = makeRequest(url, json);
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
	
	private String strip(String response) {
		int index = response.indexOf(":\"") + 2;
		int end = response.length() - 2;
		String stripped = "";
		
		for(int i = index; i < end; i++) {
			stripped += response.charAt(i);
		}
		
		System.out.println(stripped);
		return stripped;
	}
	
	/**Challenge 1**/
	private void reverseString() throws IOException {
		String getStrUrl = "http://challenge.code2040.org/api/getstring";
		String input = register.strip(register.getJson(getStrUrl, tokenMap()));
		
		Reverse reverse = new Reverse(input);
		String reversed = reverse.reverseString();
		
		String valStrUrl = "http://challenge.code2040.org/api/validatestring";
		register.getJson(valStrUrl, stringMap(reversed));
	}
	
	/**Challenge 2**/
	private String getHaystack() throws IOException {
		String hayUrl = "http://challenge.code2040.org/api/haystack";
		String haystack = register.getJson(hayUrl, tokenMap());
		return haystack;
	}
	
	private void sendIndex() throws IOException {
		String valStrUrl = "http://challenge.code2040.org/api/validateneedle";
		register.makeRequest(valStrUrl, Register.needleJson());
	}
	
	/**Challenge 3**/
	private String getPrefixArray() throws IOException {
		String prefUrl = "http://challenge.code2040.org/api/prefix";
		String prefixArray = register.getJson(prefUrl, tokenMap());
		return prefixArray;
	}
	
	private void deserializePrefix() throws IOException {
		Prefix prefixData = new ObjectMapper().readValue(register.getPrefixArray(), Prefix.class);
		System.out.println("prefix: " + prefixData.getPrefix());
		System.out.println("word arrayList: " + prefixData.getWords());
	}
	
	/**static methods**/
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
	
	private static String needleJson() {
		try {
			Needle needle = new Needle(token, register.getHaystack());
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(needle);
			System.out.print("json: " + json);
			return json;
		} catch (IOException e) {
			e.printStackTrace();
			return "IOException error";
		}
	}
	
	/**private instance variables**/
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static Register register = new Register();
	private static String token = "";
}
