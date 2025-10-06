package com.saitech.java8features.pojo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {
	
	/*
	public List<Book> getBooksInSort() {
		BookDao bookDao =  new BookDao();
		List<Book> list = bookDao.getBooks();
		Collections.sort(list, new MyComparator());
		return list;
		
	}
	public static void main(String[] args) {
		System.out.println(new BooksService().getBooksInSort());
	}
}

//Implementing Custom class & extends with Comparator

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	 */
	
	// //without Custom class & extends with Comparator
	/*
	public List<Book> getBooksInSort() {
		BookDao bookDao =  new BookDao();
		List<Book> list = bookDao.getBooks();
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {		
				return o1.getName().compareTo(o2.getName());
			}
		});
		return list;
		
	}
	public static void main(String[] args) {
		System.out.println(new BooksService().getBooksInSort());
	}
	*/
	
	//Using Lambda
		public List<Book> getBooksInSort() {
			BookDao bookDao =  new BookDao();
			List<Book> list = bookDao.getBooks();
			Collections.sort(list, ( o1, o2) -> o1.getName().compareTo(o2.getName()));
			return list;
			
		}
		public static void main(String[] args) {
			System.out.println(new BooksService().getBooksInSort());
		}
}


