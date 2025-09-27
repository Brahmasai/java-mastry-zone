package com.logicals.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Logicals {
	
	public static void main(String[] args) {
		//1
		/*String s = System.getProperty("line.separator");
		System.out.println("Hi"+s+"Welcome Sai"+s+"How are you");*/
		
		//2. Using if else & Nested If
		
		//Scanner sc = new Scanner(System.in);
		/*
		 * int a = sc.nextInt(); if (a%2==0) { if (a <10) { System.out.println("Hi"); }
		 * else if(a >10 & a<20) { System.out.println("Hellow"); } else if (a>20) {
		 * System.out.println("come"); } else { System.out.println("where"); }
		 * 
		 * }
		 */ 
		
		//3. Random Class
		
		/*
		 * Random r = new Random(); int p = r.nextInt(); System.out.println(p);
		 */
		
//		Random re = new  Random();
//		for(int i =0; i<5; i++) {
//		int p =	re.nextInt(200); // it will random digit under 200
//		System.out.println(p);
//		}
		
//		Random rc = new  Random();
//		for(int i =0; i<5; i++) {
//		int p =	200+rc.nextInt(201); // it will random digit under 200
//		System.out.println(p);
//		}
		
		
		/*
		 * Generates random numbers from 0 to 199 forever (while(true) is an infinite
		 * loop).
		 * 
		 * For each random number p:
		 * If p >= 100: it prints p and increases count.
		 * If p == 10: it breaks the loop (stops it).
		 * After the loop ends, it prints how many numbers >= 100 were printed.
		 */
		/*
		 * int count =0; Random ra = new Random(); 
		 * while (true) {
		 *  int c = ra.nextInt();
		 * if(c>=100) { 
		 * System.out.println(c);
		 *  } if (c==10) { 
		 *  break;
		 *   }
		 *    }
		 */

		//Converting String to Int
		/*
		 * String x ="25"; String y ="70"; 
		 * int p = Integer.parseInt(y);
		 *  int o = Integer.parseInt(x); 
		 * System.out.println(p+o);
		 */

		//*. Display the multiples of 3/5 b/w 0 to 50 but not common multiples.
		
//		for (int i = 0; i<=50; i++) {
//			if(i%3==0 || i%5==0) {
//				if(i%3==i%5) {
//					continue;
//				}
//				System.out.println(i);
//			}
//		}
		
		//* array sum using for each 
		
//		int[] arr = {24,35,67,78,52};
//		int sum =0;
//		for(int ar: arr) {
//			sum = sum+ar;
//		}
//		System.out.println(sum);
		
		
		// Using for loop
		
//		int[] arr = {24,35,67,78,52};
//		System.out.println(arr.length);
//		int sum = 0;
//		for (int i =0; i<arr.length; i++) {
//			sum = sum+arr[i];
//		}
//		System.out.println(sum);
		
		//Find Highest number in array
		/*int ar [] = {4,7,2,9,6,1,8};
		int largest = ar[0];
		for(int i = 1; i<ar.length; i++) {
			if(ar[i]>largest) {
				largest = ar[i];
			}
		}
		System.out.print(largest);*/
		
		//o/P: 9
		
		//Find smallest number in array
		/*int arr [] = {4,7,2,9,6,1,8};
		int smallest = ar[0];
		for(int i = 1; i<arr.length; i++) {
			if(ar[i]<smallest) {
				smallest = ar[i];
			}
		}
		System.out.print(smallest);*/
		
		//o/p: 1
		
		// Reverse the array
		
		/*int ar [] = {10,20,30,40,50,60,70};
		for (int i = ar.length-1; i>0; i--) {
			System.out.println(ar[i]);
		}*/

		// Finding Duplicate element
		/*int arr [] = {10,20,30,40,50,60,70,20};
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]  == arr[j]) {
					System.out.println(arr[i] +" is a Duplicated");
					break;
				} 
			}
			
		}*/
		
		// Another way Finding Duplicate element
		
		/*int arr [] = {10,20,30,40,50,30,30,60,70,20};
		
		 HashSet<Integer> seen = new HashSet<>();
	     HashSet<Integer> duplicates = new HashSet<>(); 

	        for (int num : arr) {
	            if (!seen.add(num)) {
	                duplicates.add(num);
	            }
	        }
	        System.out.println("Duplicate elements are:");
	        for (int dup : duplicates) {
	            System.out.println(dup);
	        }*/
		
		// Finding Duplicate element Using Scanner
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] arr = new int[sc.nextInt()];
		for (int i =0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int ln = sc.nextInt();
		int count =0;
		for (int i =0 ; i<arr.length; i++) {
			if(arr[i] == ln) {
				count++;
				System.out.println("Dupllicate Number"+ln);
				break;
			} else {
				System.out.println("Not Duplicated"+ln);
			}
		}*/
		
		// Finding Unique value from an array
		
		//int [] a = {1,2,3,4,5,4,3,2,1,6,5,3};
		
		/*Set<Integer> element = new HashSet<Integer>();
		for(int b: a) {
			element.add(b);
		}
		System.out.println(element);*/
		
		// Using Linkedhashset //To preserve Insertion Order
		
		/*Set<Integer> unique = new LinkedHashSet<Integer>();
		for(int b: a) {
			unique.add(b);
		}
		System.out.println(unique);*/
		//Using Streams
		//Arrays.stream(a).distinct().sorted().forEach(System.out::println);
		// Using Map
		
		/*Map<Integer, Integer> map = new HashMap<>();
		for(int b: a) {
			map.put(b, map.getOrDefault(b, 0)+1);
		}
		
		for (Entry<Integer, Integer> unique: map.entrySet()) {
			System.out.println( unique.getKey() +" "+ unique.getValue()+"times");
		}*/
		
		//Using Brute Force
		/*for (int i =0; i<a.length; i++) {
			boolean isDuplicate =false;
			for(int j =0; j<i; j++) {
				if(a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)
			System.out.println(a[i]);
		}*/
		
		// Finding intersection of two arrays
		/*int[]  ar= {12,23,34,45,56,67,89};
		int[] b= {13,12,34,45,65,76,87};
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<Integer>();
		
		for(int i =0; i<ar.length; i++) {
			set.add(ar[i]);
		}
		for( int j=0; j<b.length; j++) {
			if(set.contains(b[j])) {
				result.add(b[j]);
			}
		}
		System.out.println(result);*/
		
		// another way
		
		/*for (int i =0; i<ar.length; i++) {
			for(int j =0; j<b.length; j++) {
			if(ar[i] == b[j])	{
				System.out.println(a[j]); 
			}
			}
		}*/
		
		// swap all zero elements to last position in an array
		/*int[] ar= {2,3,4,0,5,0,4,6,0,7,0};
		int count  = 0; 
		for(int i =0; i<ar.length; i++) {
			if(ar[i]!=0) {
				ar[count++] = ar[i];
			} 
		}
		while (count <ar.length) { 
			ar[count++] = 0; 
		}
		for (int j =0 ; j<ar.length; j++) {
			System.out.print(ar[j]+" ");
		}*/
		
		//Using Streams
		
		/*int nonZeros = (int) Arrays.stream(ar).filter(x -> x!=0).count();
		int zeros = ar.length-nonZeros; 
		int[] result =  IntStream.concat( Arrays.stream(ar).filter(x -> x!=0), IntStream.range(0, zeros).map(i -> 0)).toArray();
		Arrays.stream(result).forEach(System.out::println);*/
		
		// removing Duplicates
		
		 /*int[] arr = {1, 2, 34, 3, 5, 2, 6, 1, 3, 8};
		 Set<Integer> set = new LinkedHashSet<Integer>();
		 for (int b: arr) {
			 set.add(b);
		 }
		 for (Integer num : set) {
			 System.out.println(num);
		 }*/
		
		// alternate Way
		/*int[] ar = {1, 2, 34, 3, 5, 2, 6, 1, 3, 8};
		
		int b = ar.length;
		for (int i =0; i<b; i++) {
			for(int j =i+1; j<b; ) {
				if(ar[i] == ar[j]) {
					ar[j] = ar[b-1];
					b--;
				} else {
					j++;
				}
			}
		}
		for (int i=0; i<b; i++ ) {
			System.out.println(ar[i]);
		}*/
		
		// Finding Leader Element
		
		/*int[] ar = {2,1,5,4,8,3,4,9,6,7};
		for(int i =0; i<ar.length; i++) {
			int count =0;
			for (int j = i+1;  j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					count++;
					break;
				}
			}
			if(count ==0) {
			System.out.println(ar[i]);	
			}
		
		}*/
		// another way
		/*int [] ar = {2,1,25,12,4,8,3,4,9,6,7};
		
		for (int i =0 ; i<ar.length; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					break;
				}
				if (j==ar.length-1) {
					System.out.println(ar[i]);
				}
			}
			
		}*/
		
		// Find String contains digits or not
		String s = "parabrahma99sai";
		
		/*char[] ch = s.toCharArray();
		int count =0;
		for (int i = 0; i<ch.length; i++) {
		if(ch[i]>48 && ch[i]<=57) {
			count++;
			break;
		}
		}
		if(count == 0) {
			System.out.println("It's alphabet string");
		} else {
			System.out.println("Digit included in the string");
		}*/
		
		//Using  number
		/*boolean hasDigit = false; 
		for (char chs : s.toCharArray()) {
			if(chs >= '0' && chs<='9') {
				hasDigit = true;
				break;
			}
		}
		if(hasDigit) {
			System.out.println("Contains Digits");
		} else {
			System.out.println("Contains Alphabets");
		}*/
		
		// Using Streams
		/*if (s.chars().anyMatch(Character::isDigit)) {
			System.out.println("String contains Digits");
		} else {
			System.out.println("String contains Alphabets");
		}*/
		
		//Finding array Sum

		/*int ar [] = {4,7,2,9,6,1,8};
		
		int sum = 0;
		for (int i =0; i< ar.length; i++) {
			sum = sum+ar[i];
		}
		System.out.println(sum);*/
		
		// Finding Smallest array
		/*int[] arr = {12,35,23,567,543,234,954,45,65,4} ;
		int smallest = arr[0];
		for (int i =1; i<arr.length; i++) {
			if(arr[i]< smallest) {
				smallest =arr[i];
			}
		}
		System.out.println(smallest);*/
		
		//Swapping using Third variable
		
		/*int a = 10, b =20, t;
		
		t =a; a =b; b = t;
		System.out.println(a +","+ b);
		//Using addition
		a = a+b;
		b = a-b; 
		a = a-b;
		System.out.println(a +","+ b);
		// Using multiplication
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a +","+ b);*/
		
		
		//Reverse a Number using scanner class
		/*Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Digits");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0) {
		rev = rev*10 + num%10;
		num = num/10;
		
		}
		System.out.println(rev);*/
			
	  // Using StringBuffer & String Builder	
			
			/*StringBuffer sbf = new StringBuffer(String.valueOf(num));
			StringBuffer sb =  sbf.reverse();
			System.out.println(sb);
			
			StringBuilder sbl = new StringBuilder(String.valueOf(num));
			System.out.println(sbl.reverse());*/
		
		// Reverse a String 
		/*String str ="parabrahmasai";
		String rev ="";
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//  Using StringBuilder
		StringBuilder  sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		// Using String buffer
		StringBuffer sbf = new StringBuffer(str); 
		System.out.println(sbf.reverse());
		//Using to CharArray
		char[] ch =   str.toCharArray();
		String revs = "";
		for(int i =ch.length-1; i>=0; i--) {
			revs = revs+ch[i];
		}
		System.out.println(revs);*/
		
		// Palindrome
		
		/*int num = 1234567;
		int acNum = num;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
			
		}
		if(acNum == rev) {
			System.out.println("It's a Palindrome"); 
		} else {
			System.out.println("It's Not a Palindrome");
		}*/
		
		// Palindrome String
		/*String str = "parabrahmasai";
		String actual = str;
		String revs = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			revs = revs+str.charAt(i);
		}
		if (revs.equalsIgnoreCase(str)) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("It's not a palindrome");
		}*/
		
		//Finding no.of of digits available in given number
		
		/*int num = 12345;
		int count = 0;
		while(num > 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);*/ 
		
		//Finding even and odd numbers in a number
		
		/*int num = 12345;
		int evenNum = 0;
		int oddNum = 0;
		
		while(num!=0) {
			int rem = num%10;
			if(rem%2==0) {
				System.out.println("Even Number");
				evenNum++;
			} else {
				System.out.println("Odd Number");
				oddNum++;
			}
		}*/
		
		// Sum of digits in a number
		/*int num =1234567;
		int sum =0;
		while (num !=0) {
			sum = sum+ num%10;
			num = num/10;
		}
		System.out.println(sum);*/
		
		// Finding largest numbers 
		 /*int a=10, b =20, c=35;   
		 
		 int num = a>b?a:b;
		 int largest = num>c?num:c;
		 System.out.println(largest);*/
		
		// Fibonacci Series
		/*int n1 =0, n2 =1, sum = 0, req=15;
		for (int i =0; i<req; i++) {
			sum = n1+n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}*/
		
		//Given number is prime or not
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num =   sc.nextInt();
		int count=0;
		
		if(num>1) {
			for(int i =1; i<num; i++) {
				if(num%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("Prime");
			} else {
				System.out.println("it's not a prime");
			}
			
		}*/
		
		//Find a factorial number
		
		
		/*int num = 5, factorial = 1;
		  for(int i=1; i<=num; i++) {
		   factorial = factorial*i; }
		  System.out.println(factorial); */
		 
		
		
		/*while(num!=0) {
			factorial = factorial*num;
			num--;
		}
		System.out.println(factorial);*/
		
		// Finding Even & odd numbers from an array
		/*int a[] = {1,3,6,7,2,4,8,9};
		int i=0;
		while(i<a.length) {
			if(a[i]%2==0) {
				System.out.println("even Number" + a[i]);
			} else {
				System.out.println("odd Number" + a[i]);
			}
			i++;
		}*/
		
		// Checking arrays are equal or not
		/*int[] a1 = { 1, 2, 3, 4, 5, 6 };
		int[] a2 = { 1, 2, 3, 4, 5, 6};
		boolean status =  Arrays.equals(a1, a2);
		if (status) {
				System.out.println("length is equal");
			
		} else {
			System.out.println("not equal");
		}*/
		//
		/*int[] a1 = { 1, 2, 3, 4, 5, 6 };
		int[] a2 = { 1, 2, 9, 4, 5, 6 };
		boolean status = true;
		if(a1.length == a2.length) {
			for (int i=0; i<a1.length; i++) {
				if(a1[i] != a2[i]) {
					status = false;
					 System.out.println("Mismatch at index " + i + ": a1[" + i + "] = " + a1[i] + ", a2[" + i + "] = " + a2[i]);
				} 
			}
		} else {
			status = false;
		}
		if (status) {
			System.out.println("equal");
		} else {
			System.out.println("Not equal"); 
		}*/
		
		//Finding missing number in a array
		
		/*int[] c = {1,2,4,5};
		int sum =0, asum =0; 
		for (int i =0; i<c.length; i++) {
			sum = sum+c[i];
		}
		for(int i =1; i<=5; i++) {
			asum = asum+i;
		}
		System.out.println(asum - sum);*/
		
		/*Using while loop*/
		/*int i =0, j=1; 
		while (i<c.length) {
			sum = sum+c[i];
			i++;
		}
		while (j<=5) {
			asum = asum+j;
			j++;
		}
		System.out.println(asum-sum);*/
		
		//Finding maximum & min element
		
		/*int[] sr = {15,27,38,59,65,2, 145,95};
		int max=15;
		int min=15;

		
		for (int i =0; i<sr.length; i++) {
			if(sr[i]>max) {
				max = sr[i];
			} else if (sr[i]<min) {
				min = sr[i];
			}
		}
		System.out.println("min" + min+ "max" + max);*/
		
		// Finding Duplicate element from an array
		
		/*String[] sr = {"sai", "ram", "krishna", "Shiva", "gopal" ,"ram","shiva"};
		boolean status = false;
		for (int i= 0; i<sr.length; i++) {
			for (int j= i+1; j<sr.length; j++) {
				if(sr[i].equalsIgnoreCase(sr[j])) {
					status = true;
					System.out.println("Found Duplicate at index " + i+ " with this value " + sr[i]);
				}
			}
		}
		
		if (!status) {
			System.out.println("No Duplicates found Here");
		}*/
		
		//
		/*int[] arr = {2,4,3,6,7,3,8,2};
		boolean status = false;
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					status = true;
					System.out.println("Duplicate Element:" + arr[i]);
				}
			}
		}
		if(!status) {
			System.out.println("No Duplicates:");
		}*/
		
		// Searching element from an array
		
		/*int[] sr = {2,4,3,6,7,3,8,2};
		
		boolean flag =false;
		int search = 3;
		for (int i=0; i<sr.length; i++) {
			if(sr[i] == search) {
				System.out.println("Found a number: " +sr[i]);
				flag =true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Not Found a number: " + search);
		}*/
		
		// removing junk characters from array
		
		/*String sr =  "dgjhdf;kbsdfj783456348756#@$$^*(jdkgksf";
		sr = sr.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sr);*/
		
		//find the index position for given element is presented
		
		int[] a1 = {1,2,4,6,7,9,6,4};
		
		int r =  Arrays.binarySearch(a1, 7);
		System.out.println(r);
		
		
	}
}