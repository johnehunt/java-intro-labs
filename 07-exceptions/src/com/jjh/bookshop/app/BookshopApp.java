package com.jjh.bookshop.app;

import com.jjh.bookshop.data.Address;
import com.jjh.bookshop.data.Author;
import com.jjh.bookshop.data.Book;
import com.jjh.bookshop.data.BookException;
import com.jjh.bookshop.data.Publisher;
import com.jjh.bookshop.data.Sales;

public class BookshopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Bookshop");		

		try {

			Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1", "23Z");
			Author author = new Author("Pete Smith", authorAddress);

			Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1", "43A");
			Publisher publisher = new Publisher("Tech Books Publishing Ltd.", publisherAddress);

			Book book = new Book("Java Unleashed", author, publisher, 15.95);
			System.out.println("Book: " + book);

			System.out.println("\nCalculating the Sales Discount price");
			book.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + book.calculateSalePrice());

			Book book2 = new Book("Java For Professionals", author, publisher, -1.0);
			System.out.println("\nBook2: " + book2);

			System.out.println("Book Instance Count: " + Book.getCount());

			Sales salesProduct = book;
			salesProduct.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + salesProduct.calculateSalePrice());

			author.prettyPrint();
			publisher.prettyPrint();
			
		} catch (BookException exp) {
			exp.printStackTrace();
		}

	}

}
