package lab.bank.model;

public class MainAccount extends Account{
	@Override
	public void extractAccount() {
		// TODO Auto-generated method stub
		System.out.println("========== Extract Main Account ===========");
		super.printExtractAccount();
	}
}
