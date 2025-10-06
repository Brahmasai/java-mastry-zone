package com.saitech.java8features.fInterface.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import org.hibernate.dialect.function.array.ArraySetUnnestFunction;

/*
public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi Sai";
	}
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo();
		System.out.println( supplier.get());
	}
}
*/

//Using Lambda
public class SupplierDemo {
	public static void main(String[] args) {
		//1
		Supplier<String> supplier = () ->  "Hi Sai";
		System.out.println( supplier.get());
		//2.
		List<String> list =  Arrays.asList("a","b");
		System.out.println(list.stream().findAny().orElseGet(supplier));
		//3.
		List<String> ls = Arrays.asList();
		System.out.println(ls.stream().findAny().orElseGet(supplier));
				
		
	}
}