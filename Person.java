import java.util.ArrayList;

public class Person {
	private String identificationNumber;
	private String name;
	private int age;
	private ArrayList <BankAccount> accountList;
	
	
	//Implementing constructor
	public Person(String identificationNumber, String name, int age) {
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.age = age;
		this.accountList = new ArrayList<BankAccount>();
	}
	public Person () {
		}
	//getters
	public String getIdentificationNumber () {
		return identificationNumber;
	}
	public String getName () {
		return name;
	}
	public int getAge () {
		return age;
	}
	public ArrayList<BankAccount> getBankAccounts () {
		return accountList;
	}
	
	//Setters
	public void setIdentificationNumber (String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setBankAccounts (ArrayList <BankAccount> bankAccounts) {
		this.accountList = bankAccounts;
	}
	
	public void addAccount (BankAccount account) {
		if (this.age >= 18 && accountList.size() < 3 ) {
			this.accountList.add(account);
		
		}
		
	}
	public BankAccount findAccount(String accountNumber) {
		for (BankAccount bankAccounts: accountList) {
			if (bankAccounts.getAccountNumber().equalsIgnoreCase(accountNumber)){
			return bankAccounts;
		}
	}
	return null;
	}
	public double calculateTotalBalance() {
		double totalBalance = 0;
		for (BankAccount accountBalance: accountList ) {
			totalBalance += accountBalance.getBalance();
		}
		return totalBalance;
	}
}
	


