package lab.bank.model;

import lab.bank.service.IAccount;

public abstract class Account implements IAccount{
	
	private static final int STANDARD_BRANCH = 1;
	private static int SEQUENCIAL = 1;
	
	protected int branch;
	protected int number;
	protected double balance;

	public Account() {
		branch = STANDARD_BRANCH;
		number = SEQUENCIAL++;
	}

	public double getBalance() {
		return balance;
	}

	public int getBranch() {
		return branch;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public void cashOut(double value) throws Exception {
		// TODO Auto-generated method stub
		if (balance > value) {
			balance = balance - value;
		} else {
			throw new Exception("No balance available for Cash-Out");
		}	
	}

	@Override
	public void deposit(double value) {
		// TODO Auto-generated method stub
		balance = balance + value;
	}

	@Override
	public void transfer(double value, Account accountTo) throws Exception{
		// TODO Auto-generated method stub
		this.cashOut(value);
		accountTo.deposit(value);
	}
	
	public void printExtractAccount() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Branch: %d", this.branch));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Branch: " + branch +  " - " + "Account: " + number;
	}

}
