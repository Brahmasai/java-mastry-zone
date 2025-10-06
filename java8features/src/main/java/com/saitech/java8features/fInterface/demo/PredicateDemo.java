package com.saitech.java8features.fInterface.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//traditional way
/*
public class PredicateDemo implements Predicate<Integer>  {
	@Override
	public boolean test(Integer t) {
		if (t%2==0 && t>20) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Predicate pt = new PredicateDemo();
		System.out.println("print : "+ pt.test(26));
	}
}
*/

//Using lambda
public class PredicateDemo   {
	public static void main(String[] args) {
		Predicate<Integer> pt =  (t) -> {
			if (t%2==0 && t>20) {
				return true;
			}
			return false;
		};
		//
		Predicate<Integer> pts =  (t) -> (t%2==0 && t>20); 
			
		System.out.println("print : "+ pt.test(26));
		System.out.println("print : "+ pts.test(26));
		
		List<Integer> list = Arrays.asList(23,45,67,78,94);
		list.stream().filter(t -> t%2==0 && t>26).forEach( t -> System.out.print(t +" "));
	}
}