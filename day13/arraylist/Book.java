package day13.arraylist;

public class Book {

	String author;
	String name;
	int price;
	
	public Book(String author, String name, int price) {
		super();
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return author + " " + name + " " + " ";
	}

}
