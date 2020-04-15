
public class BookshopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Bookshop");
		
		Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1 23Z");
		Author author = new Author("Pete Smith", authorAddress, "Technical");
		
		Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1 43A");
		Publisher publisher = new Publisher("Biull Smith", publisherAddress, "Tech Books Publishing Ltd.");
		
		Book book = new Book("Java Unleashed", author, publisher, 15.95);
		System.out.println("Book: " + book);
		
		System.out.println("\nCalculating the Sales Discount price");
		book.setSaleDiscount(10.0);
		System.out.println("Sale price of book: " + book.calculateSalePrice());

	}

}
