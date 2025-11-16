package com.saitech.java8features.logicals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.aspectj.bridge.CountingMessageHandler;

import com.saitech.java8features.stream.example.Employee;

public class Java8FeaturesLogicalsPractice {

	public static void main(String[] args) {
		// 1. Count the occurrences of each character
		String str = "JavaIsaProgrammingLanguage";
		String[] sr = str.split("");
		Map<String, Long> map = Arrays.stream(sr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		// 2. Using chars
		String strn = "JavaIsaProgrammingLanguage";
		Map<String, Long> maps = strn.chars() // gives IntStream of Unicode values
				.mapToObj(c -> String.valueOf((char) c)) // convert each int to String
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(maps);

		// 3. Find Duplicate Elements in given string
		String string = "JavaIsaProgrammingLanguage";
		List<Entry<String, Long>> de = Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).collect(Collectors.toList());
		System.out.println("Duplicate Elements: " + de);

		// 4. Find Duplicate Elements in given string getting only keys
		List<String> dek = Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Duplicate Elements keys: " + dek);

		// 5.Find Unique Elements in given string
		List<Entry<String, Long>> ue = Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).collect(Collectors.toList());
		System.out.println("Unique Elements: " + ue);

		// 6. Find First Non repeating element
		String nonrc = Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
		System.out.println("Find First Non RC :" + nonrc);

		// 7. Find First repeating element
		String rc = Arrays.stream(string.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).findFirst().get().getKey();
		System.out.println("First Repeated character: " + rc);

		// 8. Find Second Highest number in given array
		int[] arr = { 2, 13, 25, 5, 7, 9, 53, 15, 66 };
		Integer secondHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondHighest :" + secondHighest);

		// 9. Find Second Lowest number in given array
		Integer secondLowest = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
		System.out.println("secondLowest :" + secondLowest);

		// 10. Find which Element starts with 1
		List<String> elements1 = Arrays.stream(arr).boxed().map(e -> e + " ").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("elements starts with 1" + elements1);

		// 11. Skikp & Limit method usecase
		List<Integer> lists = Arrays.stream(arr).boxed().skip(1).limit(7).collect(Collectors.toList());
		System.out.println(lists);

		IntStream.range(1, 10).skip(1).limit(9).forEach(e -> System.out.println("numbers : " + e));

		// 12. Find Longest String in given array
		String[] atrArray = { "java", "Hibernate", "Spring", "MicroServices" };
		String longestString = Arrays.stream(atrArray).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
		System.out.println("longestString: " + longestString);

		// 13. Find smallest String in given array
		String smallestString = Arrays.stream(atrArray).reduce((w1, w2) -> w1.length() < w2.length() ? w1 : w2).get();
		System.out.println("smallestString: " + smallestString);

		// 14. Join method Usage
		List<String> stringList = Arrays.asList("1", "2", "3", "4");
		String result = String.join("-", stringList);
		System.out.println("newFormat:" + result);
		
		//15. WAp to find highest salary from each department.
		List<Employee> eList =  Stream.of(new Employee(101,"john","A",60000),
	              new Employee(109,"peter","B",30000),
	              new Employee(102,"mak","A",80000),
	              new Employee(103,"kim","A",90000),
	              new Employee(104,"json","C",15000))
	              .collect(Collectors.toList());
		//Grouping employees based department
		Map<String, List<Employee>> mapdept =  eList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(mapdept);
		
		//Comparing Each employee based on salary
		Comparator<Employee> cEmp =  Comparator.comparing(Employee::getSalary);
		
		Map<String, Optional<Employee>> mapdepts = eList.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.maxBy(cEmp))));
		System.out.println(mapdepts);
		
		//Approach-2
		Map<String, Employee> empMap = eList.stream()
			    .collect(Collectors.groupingBy(
			        Employee::getDept,
			        Collectors.collectingAndThen(
			            Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
			            Optional::get
			        )
			    ));
		System.out.println(empMap);
	}

}
