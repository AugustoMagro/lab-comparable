package lab.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
	private List<Book> bookList;

	public BookCatalog() {
		this.bookList = new ArrayList<>();
	}
	public void addBook(String title, String autor, int yearPublish) {
		bookList.add(new Book(title, autor, yearPublish));
	}
	public List<Book> searchByAutor(String autor){
		List<Book> booksByAutor = new ArrayList<>();
		if (!bookList.isEmpty()) {
			for (Book b: bookList){
				if (b.getAutor().equalsIgnoreCase(autor)) {
					booksByAutor.add(b);
				}
			}
		}
		return booksByAutor;
	}
}
