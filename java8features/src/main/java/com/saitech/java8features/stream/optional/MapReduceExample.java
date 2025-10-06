package com.saitech.java8features.stream.optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		
		//Before Java 8 FInding the sum of elements
		int sm = 0;
		for(Integer num : numbers) {
			sm = sm+num;
		}
		System.out.println(sm);
		//After Java 8 FInding the sum of elements
		int sum =  numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		//Using Reduce method
		Integer reduceSum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(reduceSum);
		
		Optional<Integer> rs =  numbers.stream().reduce(Integer::sum);
		System.out.println(rs.get());
		//
		Integer mtp =   numbers.stream().reduce(1, (a,b) -> a*b);
		System.out.println(mtp);
		
		//Finding Max
		Integer mx =  numbers.stream().reduce(0, (a,b)-> a>b ?a:b);
		System.out.println(mx);
		
		//Finding Max
		Integer max =  numbers.stream().reduce(Integer::max).get();
		System.out.println(max);
		
		//Find longest string from the list of strings
		
		List<String> words = Arrays.asList("corejava", "spring", "hibernate");
		 
		String str =  words.stream().reduce((w1,w2) -> w1.length()> w2.length()? w1:w2).get();
		System.out.println(str);
		
		//Using max() with Comparator.comparingInt() (Recommended)
		String strr =  words.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(strr);
		
		//Get Employee whose grade is A find the avg salary for those employees
		
		double avgSalary = EmployeeDatabase.getEmployees().stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
				.map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		
		System.out.println(avgSalary);
		
		//Get Employee whose grade is A find the sum of salary for those employees
		double sumSalary =   EmployeeDatabase.getEmployees().stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
				.map(e -> e.getSalary()).mapToDouble(i -> i).sum();
		System.out.println(sumSalary);
	}

}
