package com.logicals.basics;

interface Calc {
	//void switchOn();
	//void sum(int input);
	int subtraction(int i1, int i2);
	
}

// Traditional approach
/*
public class Calculator implements calc{
	@Override
	public void switchOn() {
		System.out.println("Switch on");
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.switchOn();
	}
}*/
// Using Lambda
public class Calculator{
	public static void main(String[] args) {
		/*Calc calc =  () ->  { System.out.println("Switch on");};
		calc.switchOn();*/
		/*Calc calc =  (input) -> System.out.println("sum :"+input);
		calc.sum(125);*/
		
	Calc calc = 	(i1, i2) -> {
			if (i2<i1) {
			throw new RuntimeException("i2 should be greater than i1");	
			} else {
			return i2-i1;
			}};
		System.out.println(calc.subtraction(52, 71));
	}
}
