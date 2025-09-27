package com.logicals.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringLogicals {

	public static void main(String[] args) {
		/*
		//1 Reverse String using toCharArray
		String str = "sai";
		char[] ch =  str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
		//Using charAt
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		// StringBuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		//
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl.reverse());
		
		*/
		
		//2. Remove Duplicate characters in given string
		/*
		String st =  "ramsai";
		StringBuilder sb1 = new StringBuilder();
		st.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);
		
		// using index of method
		StringBuilder sb2 = new StringBuilder();
		for (int i =0; i<st.length(); i++) {
		char ch =	st.charAt(i);
		int idx = st.indexOf(ch, i+1);
		if(idx == -1) {
			sb2.append(ch);
		}
		}
		System.out.println(sb2);
		// Using for loop
		char[] ch1 =  st.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i=0; i<ch1.length; i++) {
			boolean duplicate = false;
			for (int j= i+1; j<ch1.length; j++) {
				if (ch1[i] ==ch1[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				sb3.append(ch1[i]);
			}
			
		}
		System.out.println(sb3);
		
		//Using Set Interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new HashSet<Character>();
		for (int i =0; i<st.length(); i++) {
			set.add(st.charAt(i));
		}
		
		for(Character cr : set) {
			sb4.append(cr);
		}
		System.out.println(sb4);
	     */			
		//3. Reverse each word of string
		/*
		String input = "JAVA CODE";
		String[] str =  input.split(" ");
		String rev ="";
		for (String word : str) {
			String revWord ="";
			for(int i=word.length()-1; i>=0; i--) {
			revWord = revWord+word.charAt(i);
			}
			rev = rev+revWord+" ";
		}
		System.out.println(rev); */
		
		//4. Find character occurrences in a string
		/*
		String str = "hello";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
			int num = map.get(c);
			map.put(c, num+1);
			}
		}
		System.out.println(map);*/
		
		//5. Find First non repeated character 
		/*String st = "AkrishnA";
		
		for (int i =0; i<st.length(); i++) {
			boolean unique = true;
			for (int j =0 ; j<st.length(); j++) {
				if ( i!=j && st.charAt(i) == st.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(st.charAt(i));
				break;
			}
			
		}
		//another approach Using collections
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		for (int i =0; i< st.length(); i++ ) {
		char c = 	st.charAt(i);
		if (map1.containsKey(c)) {
			map1.put(c, map1.get(c)+1);
		} else {
			map1.put(c, 1);
		}
		}
		System.out.println(map1);
		for(Entry<Character, Integer> entry : map1.entrySet()) {
			if (entry.getValue() ==1) {
				System.out.println(entry.getKey());
				break;
			}
		}*/
		
		
		//6. To remove spaces
		/*String str = " j av a pract ice";
		String newStr =	str.replaceAll("\\s", "");
		System.out.println(newStr);
		
		//7. Remove special characters
		String strs = " #j av %^&a pract(*^#@! ice";
		String st1 = strs.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(st1);*/
		//^--> represents anything except this a-zA-Z0-9
		
		//8. Replace the character with occurence
		/*
		String st2 = "opentext";
		char rc = 't';
		if(st2.indexOf(rc) ==-1) {
			System.out.println("Given character not available in string");
			return;
		}
		int count = 1;
		for(int i =0; i<st2.length(); i++) {
		char c =	st2.charAt(i);
		if(c==rc) {
		st2 =	st2.replaceFirst(String.valueOf(c) ,String.valueOf(count));
		count++;
		}
			
		}
		System.out.println(st2);*/
		//this one suitable only for small strings
		/*char[] ch = st2.toCharArray();
		int count =1;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == rc) {
				ch[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}*/
		
		// 9. Find Longest Sub-string
		/*
		String strs = "abcbac";
		String logestSubString = null;
		int lengthofSubstring = 0;
		Map<Character, Integer> map =  new LinkedHashMap<Character, Integer>();
		char[] arr = strs.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
			  i = map.get(ch);
			  map.clear();
			}
			if (map.size()> lengthofSubstring) {
				lengthofSubstring = map.size();
				logestSubString = map.keySet().toString();
			}
		}
		System.out.println(logestSubString);*/
		
		
		//10. Sort the String
		/*
		String str = "rock";
		char[] ch = str.toCharArray();
		char temp; 
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]> ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
		//Another option
		Arrays.sort(ch);
		System.out.println(ch);*/
		
		//Rotate the String
		/*
		String originalString = "decode";
		int rotate = 2;
		//Left --> codede
		String ltr = originalString.substring(2)+originalString.substring(0, rotate);
		System.out.println(ltr);
		//Right  --> dedeco
		String rtr = originalString.substring(originalString.length()-rotate)
					 + originalString.substring(0,originalString.length()-rotate);
		System.out.println(rtr);
		// verify string is rotated or not
		String rotatedString = "codede";
		String concatinated = originalString+originalString;
		if (concatinated.contains(rotatedString)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		*/
		
		//
		
		
	}
	
		
}
