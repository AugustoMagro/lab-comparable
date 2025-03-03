package lab.map;

public class Contact {
	private String name;
	private int number;
	public Contact(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " - " + number;
	}
}
