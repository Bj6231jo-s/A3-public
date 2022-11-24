
public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount () {
	}
	public BankAccount (String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//getters
	public String getAccountNumber () {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	//setters
	public void setAccountNumber (String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance (double balance) {
		this.balance = balance;
	}
	public void deposit (double amount) {
		this.balance += amount;
	}
	public void withdraw (double amount) {
		if (this.balance > amount && this.balance > 0 && amount < this.balance / 2) {
		this.balance -= amount;
	}
	System.out.println("Error, invalid amount of funds, witdrawl fail");
	}
}
