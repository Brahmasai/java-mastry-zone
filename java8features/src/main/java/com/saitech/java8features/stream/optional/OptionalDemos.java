package com.saitech.java8features.stream.optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemos {

	public static void main(String[] args) {
		
		List<Customer> list = EkartDataBase.getAll();
		
		// List<Customer> converting to List<String> DataTransfermation
		//customer -> customer.getEmail() --> one to one mapping
		List<String> emails =  list.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		//
		List<List<String>> phone = list.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phone);
		
		//customer -> customer.getPhoneNumbers() --> one to Many mapping()
		List<String> phones = list.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phones);
		
		
	}
}
