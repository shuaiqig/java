package exercise2;

public class Customer {
	
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
	
	@SuppressWarnings("unused")
	private double balance;
	
	Account(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
}
