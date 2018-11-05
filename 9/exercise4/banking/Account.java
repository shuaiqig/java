package banking;

import banking.domain.OverdraftException;

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
	
	public void withdraw(double amount) throws OverdraftException{
		if(amount < balance) {
			balance = balance - amount;
		}
		else {
			throw new OverdraftException("Insufficient funds", amount- balance);
		}

	}
}
