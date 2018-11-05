package banking;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Customer> customers;
	
	private Bank() {
		this.customers = new ArrayList<>();
	}
	
	public void addCustomer(String f, String l) {
		
		this.customers.add(new Customer(f, l));
	}
	
	public int getNumOfCustomers() {
		
		return customers.size();
	}
	
	public static Bank bank = new Bank();
	
	public static Bank getBank() {
		
		return bank;
	}
	
	public Customer getCustomer(int index) {
		
		return this.customers.get(index);
	}
}
