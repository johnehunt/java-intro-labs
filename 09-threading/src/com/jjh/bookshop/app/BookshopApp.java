package com.jjh.bookshop.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.jjh.bookshop.data.Book;
import com.jjh.bookshop.data.Bookshop;
import com.jjh.bookshop.data.Sales;

public class BookshopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Bookshop");

		Bookshop bookshop = new Bookshop();

		for (Book book : bookshop.getBooks()) {
			System.out.println("Book: " + book);
		}

		if (bookshop.getBooks().size() > 0) {
			Book book1 = bookshop.getBooks().get(0);
			book1.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + book1.calculateSalePrice());
			book1.getAuthor().prettyPrint();
			book1.getPublisher().prettyPrint();
		}

		if (bookshop.getBooks().size() > 1) {
			Sales salesProduct = bookshop.getBooks().get(1);
			salesProduct.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + salesProduct.calculateSalePrice());
		}
		
		Callable<Double> callable = new Callable<Double>() {
		    public Double call() throws Exception {
		        Thread.sleep(100);
		        double total = 0.0;
		        for (Book book : bookshop.getBooks()) {
					total = total + book.getPrice();
				}
		        return total;
		}};

		ExecutorService es = Executors.newFixedThreadPool(4);
		Future<Double> future = es.submit(callable);
		try {
		    // Waits until a result is provided
		    double result = future.get();
		    System.out.println("Result from future.get () = " + result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		es.shutdown();

	}

}
