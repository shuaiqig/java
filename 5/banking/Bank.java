package banking;

public class Bank {
	
	int numberOfCustomers;
	Customer[] customers;
	
	public Bank() {
		this.customers = new Customer[5];
		this.numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l) {
		
		this.customers[numberOfCustomers] =  new Customer(f, l);
		
		this.numberOfCustomers++;
	}
	
	public int getNumOfCustomers() {
		
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		
		return this.customers[index];
	}
}

class Customer {
	
	private String firstName;
	private String lastName;
	
	private Account account;
	
	Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setAccount(Account a) {
		
		this.account = a;
	}
	
	public Account getAccount() {
		
		return account;
	}	
}

class Account {
	
	private double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public  boolean deposit(double amount) {
		balance = balance + amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if(amount < balance) {
			balance = balance - amount;
			return true;
		}
		else {
			return false;
		}

	}
}
