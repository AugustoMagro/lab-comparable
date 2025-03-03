package lab.map;

public class Phone {
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		
		contacts.addContact("Augusto", 123455545);
		contacts.addContact("Abner", 123455545);
		contacts.addContact("Astolpho", 123455545);
		contacts.addContact("Enzo", 123455545);
		contacts.addContact("Elias", 123455545);
		
		contacts.showContacts();
		
		contacts.removeContact("Astolpho");
		
		contacts.showContacts();
		
		System.out.println(contacts.searchByName("Enzo"));
		
	}
}
