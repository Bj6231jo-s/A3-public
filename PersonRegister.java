import java.util.ArrayList;

public class PersonRegister {
	private ArrayList<Person> personList;
	
	public PersonRegister() {
		this.personList = new ArrayList<Person> ();
	}
	public ArrayList<Person> getPersonList() {
		return this.personList;
	}
	public void addPerson(Person person) {
		this.personList.add(person);
	}
	public Person findPerson(String identificationNumber) {
		for (Person person: personList) {
			if (person.getIdentificationNumber().equalsIgnoreCase(identificationNumber)) {
				return person;
			}
		}
		return null;
	}
	public BankAccount findAccount(String accountNumber) {
		for (Person person: personList) {
			for (BankAccount bankAccount: person.getBankAccounts()) {
				if (bankAccount.getAccountNumber().equalsIgnoreCase(accountNumber))
					return bankAccount;
			}
		}
		return null;
	}
	public double calculateTotalBalance() {
		double totalBalance = 0;
		for (Person person: personList) {
			for (BankAccount bankAccount: person.getBankAccounts()) {
				totalBalance += bankAccount.getBalance();
		}
	}
	return totalBalance;
	}
}
