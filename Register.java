/*
 * File: Register.java
 * -------------------------------
 * This class sends registration info to Code2040's website.
 * It also completes subsequent challenges by calling instances of other classes.
 */

import java.io.*;
import java.net.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Register {
	
	public static void main(String[] args) throws IOException {
		// Challenge 0: registration, get token
		String regUrl = "http://challenge.code2040.org/api/register";
		String json = register.getJson(regUrl, registrationMap());
		Token tokenClass = gson.fromJson(json, Token.class);
		token = tokenClass.getResult();
		
		// Challenge 1: reverse string
		register.reverseString();
		
		// Challenge 2: find needle
		register.needleIndex();
		
		// Challenge 3: find non-prefixed words
		register.workPrefixArray();
		
		// Challenge 4: add interval to date
		register.getDateStamps();
	}
	
	/**general JSON methods**/
	private String getJson(String url, Map map) throws IOException {
		String json = gson.toJson(map, Map.class);
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
		String json = register.getJson(getStrUrl, tokenMap());
		
		Reverse reverse = gson.fromJson(json, Reverse.class);

		String valStrUrl = "http://challenge.code2040.org/api/validatestring";
		register.getJson(valStrUrl, stringMap(reverse.reverseString()));
	}
	
	
	/**Challenge 2**/
	private void needleIndex() throws IOException {
		
		String hayUrl = "http://challenge.code2040.org/api/haystack";
		String json = register.getJson(hayUrl, tokenMap());
		
		NeedleJSON result = gson.fromJson(json, NeedleJSON.class);
		int index = result.getIndex();
		
		String valStrUrl = "http://challenge.code2040.org/api/validateneedle";
		register.getJson(valStrUrl, register.needleMap(index));
	}
	
	
	/**Challenge 3**/
	private String getPrefixArray() throws IOException {
		String prefUrl = "http://challenge.code2040.org/api/prefix";
		return register.getJson(prefUrl, tokenMap());
	}
	
	private void workPrefixArray() throws IOException {
		
		String json = register.getPrefixArray();
		PrefixJSON result = gson.fromJson(json, PrefixJSON.class);
		String[] finalArray = result.getFinalArray();
		
		String valPrefUrl = "http://challenge.code2040.org/api/validateprefix";
		register.getJson(valPrefUrl, prefixMap(finalArray));
	}
	
	
	/**Challenge 4**/
	private void getDateStamps() throws IOException {
		String timeUrl = "http://challenge.code2040.org/api/time";
		
		String json = register.getJson(timeUrl, tokenMap());
		TimeJSON result = gson.fromJson(json, TimeJSON.class);
		String answer = result.getAnswer();
		
		String valTimeUrl = "http://challenge.code2040.org/api/validatetime";
		register.getJson(valTimeUrl, register.timeMap(answer));
	}
	
	/**static methods**/
	private static Map<String, String> registrationMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("email", "leilani3@stanford.edu");
		map.put("github", "https://github.com/lanidelrey/code2040");
		return map;
	}
	
	private static Map<String, String> tokenMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("token", token);
		return map;
	}
	
	private static Map<String, String> stringMap(String string) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("token", token);
		map.put("string", string);
		return map;
	}
	
	private static Map<String, Object> needleMap(int index) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", token);
		map.put("needle", index);
		return map;
	}
	
	private static Map<String, Object> prefixMap(String[] array) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", token);
		map.put("array", array);
		return map;
	}
	
	private static Map<String, String> timeMap(String time) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("token", token);
		map.put("datestamp", time);
		return map;
	}
	
	/**private instance variables**/
	private static Register register = new Register();
	private static String token = "";
	private static Gson gson = new GsonBuilder().create();
}
