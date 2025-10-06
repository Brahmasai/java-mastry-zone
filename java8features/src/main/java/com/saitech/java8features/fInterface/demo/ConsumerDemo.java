package com.saitech.java8features.fInterface.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Traditional way
/*
public class ConsumerDemo implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("printing:" + t);
	}
	public static void main(String[] args) {
		ConsumerDemo demo = new ConsumerDemo();
		demo.accept(10);
	}

}
*/

// Using lambda
public class ConsumerDemo {
	public static void main(String[] args) {
		/*
		Consumer<Integer> consumer =	(t) -> System.out.println("printing:" + t);
		consumer.accept(10);
		*/
		/*
		List<Integer> list =  Arrays.asList(1,2,3,4,5);
		list.stream().forEach(a -> System.out.println("Print:" + a));
		*/
		
	}

}