public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber=0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		this.accountNumber = super.getAccountNumber() + "-"+this.savingsNumber;
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount,amount);			// calling super class's copy constructor
		this.savingsNumber = 1+ oldAccount.savingsNumber;			// increament savings number
		this.accountNumber = super.getAccountNumber() + "-"+this.savingsNumber;		// update account number
	}
	public void postInterest() {			// deposite interest of one month in account
		super.deposit((rate/12) * super.getBalance() * 0.01 );
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
}