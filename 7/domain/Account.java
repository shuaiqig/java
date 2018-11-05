package domain;

public class Account {
	
	protected double balance;
	
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
