package domain;

public class Bank {
	
	int numberOfCustomers;
	Customer[] customers;
	
	private Bank() {
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
	
	public static Bank bank = new Bank();
	
	public static Bank getBank() {
		
		return bank;
	}
	
	public Customer getCustomer(int index) {
		
		return this.customers[index];
	}
}
