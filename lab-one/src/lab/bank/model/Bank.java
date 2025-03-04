package lab.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	private List<Account> accounts;
	
	public Bank(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void showAccounts() {
		System.out.println(accounts);
	}
	
	public void showAccountsBalances() {
		accounts.stream()
			.mapToDouble(n -> n.getBalance())
			.forEach(System.out::println);
	}
	
	public Account searchAccount(int branch, int number) {
		Account account = null;
		if (!accounts.isEmpty()) {
			for (Account acc: accounts) {
				if (acc.getBranch() == branch && acc.getNumber() == number) {
					account = acc;
				}
			}
		} else {
			System.out.println("The Bank is empty");
		}
		return account;
	}
}
