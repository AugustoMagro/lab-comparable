package lab.list.search;

public class Book {
	private String title;
	private String autor;
	private int yearPublish;
	
	public Book(String title, String autor, int yearPublish) {
		this.title = title;
		this.autor = autor;
		this.yearPublish = yearPublish;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAutor() {
		return autor;
	}

	public int getYearPublish() {
		return yearPublish;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + " - " + autor + " - " + yearPublish;
	}
}
