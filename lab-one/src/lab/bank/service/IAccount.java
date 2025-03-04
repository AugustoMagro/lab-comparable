package lab.bank.service;

import lab.bank.model.Account;

public interface IAccount {
	void cashOut(double value) throws Exception;
	
	void deposit(double value);

	void transfer(double value, Account accountTo) throws Exception;
	
	void extractAccount();
	
}
