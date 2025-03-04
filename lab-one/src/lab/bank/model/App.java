package lab.bank.model;

public class App {
	public static void main(String[] args) throws Exception {
		
		Account account = null;
		Bank bank = new Bank("Stannum");
		
		bank.addAccount(new MainAccount());
		bank.addAccount(new MainAccount());
		bank.addAccount(new MainAccount());
		bank.addAccount(new SavingAccount());
		
		bank.showAccounts();
		account = bank.searchAccount(1, 1);
		account.deposit(1000);
		
		account = bank.searchAccount(1, 2);
		account.deposit(765.2);
		
		account = bank.searchAccount(1, 3);
		account.deposit(155.2);
		
		account = bank.searchAccount(1, 2);
		account.cashOut(100);
		
		bank.showAccountsBalances();
		
		account = bank.searchAccount(1, 2);
		account.cashOut(100);
		
		bank.showAccountsBalances();
	}
}
