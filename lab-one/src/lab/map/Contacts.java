package lab.map;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
	private Map<String, Integer> contactsMap;

	public Contacts() {
		this.contactsMap = new HashMap<>();
	}
	
	public void addContact(String name, Integer number) {
		contactsMap.put(name, number);
	}
	
	public void removeContact(String name) {
		if (!contactsMap.isEmpty()) {
			contactsMap.remove(name);
		}
	}
	
	public void showContacts() {
		System.out.println(contactsMap);
	}
	
	public Integer searchByName(String name) {
		Integer phoneNumber = null;
		if(!contactsMap.isEmpty()) {
			phoneNumber = contactsMap.get(name);
		}
		return phoneNumber;
	}
}
