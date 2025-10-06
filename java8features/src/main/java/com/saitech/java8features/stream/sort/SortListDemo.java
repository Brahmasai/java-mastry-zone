package com.saitech.java8features.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.saitech.java8features.stream.example.DataBase;
import com.saitech.java8features.stream.example.Employee;

public class SortListDemo {
	public static void main(String[] args) {
		/*
		List<Integer> list =  new ArrayList();
		list.add(3);
		list.add(45);
		list.add(67);
		list.add(23);
		list.add(12);
		list.add(5);
		
		//Normal way Ascending 
		Collections.sort(list);
		System.out.println(list);
		//Normal way descending 
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//Using Stream & lambda asc
		list.stream().sorted().forEach(e -> System.out.println(e));
		// descending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
		*/
		
		// sort Using Custom class 
		/*
		List<Employee> list =   DataBase.getEmployees();
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		*/
		//With out custom class & Calling Comparator Interface here
		/*
		List<Employee> lst =   DataBase.getEmployees();
		Collections.sort(lst, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary()-o1.getSalary()); // descending
			}
		});
		System.out.println(lst);
		*/
		
		// With out custom class & Using Lambda
		List<Employee> lste =   DataBase.getEmployees();
		Collections.sort(lste, (o1, o2) -> (int) (o1.getSalary()-o2.getSalary()));
		//System.out.println(lste);
		
		//Using Streams
		//lste.stream().sorted((o1,o2) -> (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
		
		//Using Comparator & Comparing
		//lste.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::print);
		//Using Method reference
		lste.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
	}

}


class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//return (int) (o1.getSalary()-o2.getSalary()); // ascending
		return (int) (o2.getSalary()-o1.getSalary()); // descending
	}
	
}