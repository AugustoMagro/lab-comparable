package lab.bank.model;

public class SavingAccount extends Account{
	@Override
	public void extractAccount() {
		// TODO Auto-generated method stub
		System.out.println("========== Extract Saving Account ===========");
		super.printExtractAccount();
	}
}
