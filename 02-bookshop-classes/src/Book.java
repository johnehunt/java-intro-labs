
public class Book {

	private String title;
	private Author author;
	private Publisher publisher;
	private double price;
	private double salePercentage;

	public Book(String title, Author author, Publisher publisher, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public void setSaleDiscount(double salePercentage) {
		this.salePercentage = salePercentage / 100.0;
	}

	public double calculateSalePrice() {
		return price - (price * salePercentage);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Book [title=%s, author=%s, publisher=%s, price=%s]", title, author, publisher, price);
	}

}
