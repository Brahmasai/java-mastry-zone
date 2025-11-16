package com.saitech.java8features.Exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("44", "373", "789");
		// Converting String to int
		List<Integer> intList = list.stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
		System.out.println(intList);

		// Handling Exception
		List<String> lists = Arrays.asList("44", "373", "abc");
		// Converting String to int
		/*
		 * List<Integer> listint = lists.stream().map( i ->
		 * Integer.parseInt(i)).collect(Collectors.toList());
		 * System.out.println(listint);
		 */

		// lists.stream().forEach(s -> System.out.println(Integer.parseInt(s)));

		// approach -1
		/*
		lists.stream().forEach(i -> {
			try {
				System.out.println(Integer.parseInt(i));
			} catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
			}
		});
		*/
		// approach -2 Create separate method & calling here.
		/*
		lists.stream().forEach(ExceptionHandlingDemo::printList);
		*/
		// approach-3 adding all the intermediate operation in single line.
		/*
		lists.forEach(handleIfAny(s -> System.out.println(Integer.parseInt(s))));
		*/
		// approach-4 Handling exceptions for Type generic
		//lists.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));

		// Handle different exceptions
		List<Integer> listint = Arrays.asList(44, 373, 789,8,5,0);
		
		//listint.forEach(handleGenericException(s -> System.out.println(10/s), ArithmeticException.class));
		
		// Verify CheckedExceptions
		List<Integer> listex = Arrays.asList(10, 40, 50);
		
		listex.forEach(i -> { try {
			Thread.sleep(i);
			System.out.println(i);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
			}
		});
		
		//calling generic Exception
		//listex.forEach(handleCheckedExceptionConsumer(Thread::sleep));
		
		listex.forEach(handleCheckedExceptionConsumer(i-> {
			Thread.sleep(i);
			System.out.println(i);
		}));
	}

	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}

	static Consumer<String> handleIfAny(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception ex) {
				System.out.println("exception: " + ex.getMessage());
			}
		};

	}

	
	
	static <Target, ExObject extends Exception> Consumer<Target> handleGenericException(Consumer<Target> target,
			Class<ExObject> exobjClass) {

		return obj -> {
			try {
				target.accept(obj);
			} catch (Exception ex) {
				try {
					ExObject exObject = exobjClass.cast(ex);
					System.out.println("exception: " + exObject.getMessage());
				} catch (ClassCastException ecx) {
					throw ex;
				}
				// validating exception thrown is it correct or not
			}
		};
	}
	
	
	static <Target>  Consumer<Target> handleCheckedExceptionConsumer(CheckedExceptionHandlerConsumer<Target, Exception> handleCns) {
		
		return obj -> {
			try {
				handleCns.accept(obj);
			} catch(Exception ex) {
				throw new RuntimeException("ex: "+ex);
			}
		};
	}

}
