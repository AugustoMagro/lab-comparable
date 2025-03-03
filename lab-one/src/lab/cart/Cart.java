package lab.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> cart;

	public Cart() {
		this.cart = new ArrayList<>();
	}
	
	public void addItem(String name, double price) {
		cart.add(new Item(name, price));
	}
	
	public void showItems() {
		System.out.println(cart);
	}
	
	public double sumItems() {
		if (cart.isEmpty()) {
			throw new RuntimeException("The cart is empty");
		} else {
			return cart.stream()
					.mapToDouble(item -> item.getPrice())
					.sum();
		}
	}
}
