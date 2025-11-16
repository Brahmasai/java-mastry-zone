package com.logicals.basics;

public class SingletonDemo {

	public static void main(String[] args) {

		EagerSingleton obj1 =  EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());
		
		
		LazySingleton obj3 = LazySingleton.getInstance();
		System.out.println(obj3.hashCode());
		
		LazySingleton obj4 = LazySingleton.getInstance();
		System.out.println(obj4.hashCode());
	}

}
