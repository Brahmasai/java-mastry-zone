package com.saitech.java8features.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmpService {

	public static List<Employee> evaluateTaxUsers(String input) {
		/*
		if (input.equalsIgnoreCase("tax")) {
			return DataBase.getEmployees().stream().filter(emp -> emp.getSalary()>500000).collect(Collectors.toList());
		}
		else {
			return DataBase.getEmployees().stream().filter(emp -> emp.getSalary()<=500000).collect(Collectors.toList());
		}
		*/
		//Using ternary operator
		return input.equalsIgnoreCase("tax")
				? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());
		
		
	}
	public static void main(String[] args) {
		System.out.println( evaluateTaxUsers("tax"));
		System.out.println( evaluateTaxUsers("Nontax"));
	}

}
