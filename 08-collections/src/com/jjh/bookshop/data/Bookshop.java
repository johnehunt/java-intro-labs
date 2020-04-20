package com.jjh.bookshop.data;

import java.util.ArrayList;
import java.util.List;

public class Bookshop {
	
	private List<Book> books = new ArrayList<Book>();
	
	public Bookshop() {
		initBookList();
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public int getBookCount() {
		return this.books.size();
	}
	
	public Book getBookByTitle(String title) {
		for (Book book : getBooks()) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
	
	private void initBookList() {
		try {

			Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1", "23Z");
			Author author = new Author("Pete Smith", authorAddress);

			Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1", "43A");
			Publisher publisher = new Publisher("Tech Books Publishing Ltd.", publisherAddress);

			Book book = new Book("Java Unleashed", author, publisher, 15.95);
			books.add(book);

			Book book2 = new Book("Java For Professionals", author, publisher, 15.95);
			System.out.println("\nBook2: " + book2);

			System.out.println("Book Instance Count: " + Book.getCount());

			books.add(book2);
			
		} catch (BookException exp) {
			exp.printStackTrace();
		}
	}

}
