
public class Execution {

	public static void main(String[] args) {
		PersonRegister personRegister = new PersonRegister();
		Person p1 = new Person("A1", "Björn", 23);
		Person p2 = new Person("A2", "Johan", 19);
		Person p3 = new Person("A3", "Max", 17);
	
		personRegister.addPerson(p1);
		personRegister.addPerson(p2);
		personRegister.addPerson(p3);
		
		BankAccount a1 = new BankAccount("a1", 1000);
		BankAccount a2 = new BankAccount("a2", 10000);
		BankAccount a3 = new BankAccount("a3", 100000);
		BankAccount a4 = new BankAccount("a4", 1000000);
		BankAccount a5 = new BankAccount("a5", 100);
		BankAccount a6 = new BankAccount("a6", 200);
		BankAccount a7 = new BankAccount("a7", 200);
		BankAccount a8 = new BankAccount("a8", -500);
		p1.addAccount(a1);
		p1.addAccount(a2);
		p2.addAccount(a3);
		p2.addAccount(a4);
		p2.addAccount(a8);
		
		//Testing find account method
		System.out.println(p1.getName() + " has " + personRegister.findAccount("a1").getAccountNumber());
		
		//Testing calculate total balance
		System.out.println("The total balance for all account in the person register is " + personRegister.calculateTotalBalance());
		
		//Testing find person method
		System.out.println("Looking for " + personRegister.findPerson("a1").calculateTotalBalance());
		
		//Testing deposit 
		System.out.println("The total balance for " + p1.findAccount("a1").getAccountNumber() + " " + p1.findAccount("a1").getBalance());
		p1.findAccount("a1").deposit(70);
		System.out.println("The total balance for " + p1.findAccount("a1").getAccountNumber() + " after depositing is " + p1.findAccount("a1").getBalance());
		
		//Testing getter
		System.out.println(p1.getName() + " has " + p1.getBankAccounts().size() + " bank accounts");
		
		//Testing calculate the total balance of one person 
		System.out.println("The total balance of all " + p1.getName() + "s accounts is " + p1.calculateTotalBalance());
		
		//Testing withdraw (business rule) can withdraw a maximum of 50% of one account at one time 
		System.out.println("Trying to withdraw 600 from " + p1.findAccount("a1").getAccountNumber());
		p1.findAccount("a1").withdraw(600);
		System.out.println(p1.findAccount("a1").getAccountNumber() + " has " + p1.findAccount("a1").getBalance());
		
		//Testing to withdraw from a negative balance 
		System.out.println("Trying to withdraw 1 from an account with negative balance");
		System.out.println("Balance for account " + p2.findAccount("a8").getBalance());
		System.out.println("Withdrawing 1 from " + p2.findAccount("a8").getAccountNumber());
		p2.findAccount("a8").withdraw(1);
		System.out.println("The new balance is " + p2.findAccount("a8").getBalance());
		
		//Testing to business rule 2, adding an account to a minor 
		System.out.println("Trying to add an account to  minor " + p3.getName()+ " with current age " + p3.getAge() + ", current amount of accounts " + p3.getBankAccounts().size());
		System.out.println("Adding account to " + p3.getName());
		p3.addAccount(a7);
		System.out.println("Printing out number of account for " + p3.getName() + " "+ p3.getBankAccounts().size());
		
		//Testing add account (Business rule) no more than 3 accounts
		System.out.println("Person " + p1.getName() + " has " + p1.getBankAccounts().size() + " bank accounts");
		System.out.println("Trying to add another 3 accounts ");
		p1.addAccount(a5);
		p1.addAccount(a6);
		p1.addAccount(a8);
		System.out.println("Person " + p1.getName() + " has "+ p1.getBankAccounts().size() + " accounts");
		System.out.println(p1.getName() + " has " + p1.getBankAccounts());
	}
		 			
}



