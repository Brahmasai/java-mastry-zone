package com.saitech.java8features.parallestream;

import java.util.List;
import java.util.stream.IntStream;

import com.saitech.java8features.stream.optional.Employee;
import com.saitech.java8features.stream.optional.EmployeeDatabase;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		/*
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Normal Stream Timen taken: "+ (end-start));
		
		System.out.println("******************************");

		start = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Timen taken: "+ (end-start));
		*/
		
		/*
		IntStream.range(1, 10).forEach(x -> {
			System.out.println("Plain Stream Thread:" + Thread.currentThread().getName() +": "+x);
		});
		
		IntStream.range(1, 10).parallel().forEach(a -> {
			System.out.println("Parallel Stream: "+ Thread.currentThread().getName() +" :" +a);
		});
		*/
		
		long start = 0;
		long end = 0;
		
		
		 List<Employee>  eList =   EmployeeDatabase.getAllEmployees();
		 
		 start = System.currentTimeMillis();
		 double sal =  eList.stream().map(Employee::getSalary).mapToDouble(e -> e).average().getAsDouble();
		 end = System.currentTimeMillis();
		 
		 System.out.println("Normal Stream Time Taken: "+ (end-start) +" "+ sal );
		 
			
		 List<Employee>  eLists =   EmployeeDatabase.getAllEmployees();
		 
		 start = System.currentTimeMillis();
		 double salaries =  eLists.stream().map(Employee::getSalary).parallel().mapToDouble(e -> e).average().getAsDouble();
		 end = System.currentTimeMillis();
		 
		 System.out.println("Parallel Stream Time Taken: "+ (end-start) +" "+ salaries);
		 
		 //
		 start = System.currentTimeMillis();
		 double eSalaries =  eLists.parallelStream().map(Employee::getSalary).mapToDouble(e -> e).average().getAsDouble();
		 end = System.currentTimeMillis();
		 System.out.println("Parallel Streams Time Taken: "+ (end-start)+ " "+ eSalaries);
	}

}
