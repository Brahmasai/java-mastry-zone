package com.saitech.java8features.fInterface.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class StreamsDemo {

	/*
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sai");
		list.add("ram");
		list.add("shiva");
		list.add("hari");
		list.add("vishnu");
		
		//1. using stream
		list.stream().forEach(t -> System.out.println(t));
		
		//2. Enhanced for-each loop
		for (String ls :list) {
			System.out.println(ls);
		}
		//3. Classic for loop (index-based)
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//4. Using Iterator
		Iterator<String> itr =  list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//5. Using ListIterator
		ListIterator<String> ltr =  list.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		//6. Using forEach method
		list.forEach(t -> System.out.println(t));
		//7. Using method reference
		list.forEach(System.out::println);
		//8. Using Parallel Stream
		list.parallelStream().forEach(a -> System.out.println(a));
		
		
	}
	*/
	
	//Map
	/*
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		
		//1. Using entrySet() with enhanced for-each 
		//Pros: Access both key and value easily.
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		//2.Using keySet() with for-each
		//Pros: Simple if you only need keys or values.
		//Cons: Slightly less efficient than entrySet() for large maps.
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		
		//3. Using Iterator on entrySet()
		Iterator<Map.Entry<Integer, String>> itr =   map.entrySet().iterator();
		
		while(itr.hasNext()) {
		Map.Entry<Integer, String> entry =	 itr.next();
		System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		//4. Using forEach method
		map.forEach((k,v) -> System.out.println(k +" "+ v));
		//5. Using Stream API 
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" "+ entry.getValue()));
		//6. Using Stream API on keySet()
		map.keySet().stream().forEach(key -> System.out.println(key +" "+ map.get(key)));
		//7. Using Iterator on keySet()
		
		Iterator<Integer> its =    map.keySet().iterator();
		while (its.hasNext()) {
		Integer it = 	its.next();
		System.out.println(it +"-"+ map.get(it));
		}
		
		// Consumer working flow
		Consumer<String> consumer = t -> System.out.println(t);
		consumer.accept("Hello BaBu");
	}
	 */

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sai");
		list.add("ram");
		list.add("shiva");
		list.add("hari");
		list.add("vishnu");
		
		// Filter usage
		list.stream().filter(t -> t.startsWith("h")).forEach(System.out::println);
		list.stream().filter(t -> t.toLowerCase().startsWith("h")).forEach(System.out::println);
		
		list.stream().filter(t -> t.regionMatches(true, 0, "h", 0, 1)).forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		
		map.entrySet().stream().filter(k -> k.getKey()%2==0).forEach(obj -> System.out.println(obj));
		
	}
}
