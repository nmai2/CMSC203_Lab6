public class CheckingAccount extends BankAccount {
	private static double FEE =  0.15;
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");			// concatenate account number with -10
	}
	public boolean withdraw(double amount) {
		double newAmount = amount+FEE;				// nwe amount to withdraw with FEE
		return super.withdraw(newAmount);			// calling withdraw funtion of superclass
	}
}
