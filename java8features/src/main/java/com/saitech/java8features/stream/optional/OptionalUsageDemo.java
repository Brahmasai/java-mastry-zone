package com.saitech.java8features.stream.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalUsageDemo {
	
	//
	public static Customer  getCustomerEmailById(String email) throws Exception {
		// Directly object getting if object is not we get error
		/*
		List<Customer> list = 	EkartDataBase.getAll();
		return list.stream().filter(customer -> customer.getEmail().equalsIgnoreCase(email)).findAny().get();
		*/
		//if object is not there we are returning some default value
		/*
		List<Customer> listc = 	EkartDataBase.getAll();
		return listc.stream().filter(customer -> customer.getEmail().equalsIgnoreCase(email)).findAny()
				.orElse(new Customer());
				*/
		//if object is not there throw exception
		List<Customer> listc = 	EkartDataBase.getAll();
		return listc.stream().filter(customer -> customer.getEmail().equalsIgnoreCase(email)).findAny()
				.orElseThrow(() -> new Exception("NO Customer with the given Email"));
	 }
	 

	public static void main(String[] args) throws Exception {
		
		
		 /*
		 Customer customer=new Customer(101, "john", null , Arrays.asList("397937955", "21654725"));
		 
		 Optional<Object> empOptional =  Optional.empty(); // It will create empty optional object.
		 System.out.println(empOptional);
		 
		 //Optional<String> email = Optional.of(customer.getEmail()); //It will return Null Pointer Exception if given value is null.
		 //System.out.println(email);
		 
		 //If we are sure given value is not null then only we have to use Optional.of()
		 
		 Optional<String> emailoptional =  Optional.ofNullable(customer.getEmail());
		 System.out.println(emailoptional);
		 
		//If we are Not sure given value is not null then only we have to use Optional.ofNullable()
		 
		 //returning some default value if customer.getEmail() is empty.
		 //System.out.println(emailoptional.orElse("default@gmail.com"));
		 
		 //returning some exception  if customer.getEmail() is empty.
		 //System.out.println(emailoptional.orElseThrow(() -> new IllegalArgumentException("Email should not bne null")));
		 
		 //returning  value if customer.getEmail() is Not empty.
		 System.out.println(emailoptional.map(String::toUpperCase).orElseGet(() -> "default value"));
		 */
		
		getCustomerEmailById("sai");
	}
}
