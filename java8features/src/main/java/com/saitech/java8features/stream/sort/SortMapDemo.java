package com.saitech.java8features.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.saitech.java8features.stream.example.Employee;

public class SortMapDemo {

	/*
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		//Normal Way
		List<Entry<String, Integer>> list = new ArrayList(map.entrySet());
		/*
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		for(Entry<String, Integer> entr : list) {
			System.out.println(entr.getKey() +" "+ entr.getValue());
		}
		
		*/
		/*
		// Using Lambda
		Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey())); // based on key
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue())); // based on value
		
		for(Entry<String, Integer> entr : list) {
			System.out.println(entr.getKey() +" "+ entr.getValue());
		}
		*/
		
		// Using Stream
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//reverse
		//map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).forEach(System.out::println);
		//Use Lambda
		//map.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(System.out::println);

	//}*/
	
	//Considering custom object
	public static void main(String[] args) {
		
		// Using Comparator 
		/*
		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
		
		System.out.println(employeeMap);
		*/
		
		//Using Lambda
		Map<Employee, Integer> employeeMap = new TreeMap<>(( o1,  o2) ->  o2.getName().compareTo(o1.getName())); // reverse order 
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
		//System.out.println(employeeMap);
		
		//Using stream when key is custom object. ascending order
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
				.forEach(System.out::println);
		
		//Using stream when key is custom object. descending order
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
						.forEach(System.out::println);
		
	}
		
}
