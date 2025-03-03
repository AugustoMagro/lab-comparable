package lab.cart;

public class Store {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem("Banana", 10);
		cart.addItem("Carot", 10);
		cart.addItem("Apple", 10);
		cart.addItem("Pinepple", 10);
		cart.addItem("Tomato", 10);
		
		cart.showItems();
		System.out.println(cart.sumItems());
	}
}
