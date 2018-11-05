package banking;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
	
	private String firstName;
	private String lastName;
	
/**
 * 	����Customer�����飬ÿ���ͻ�������5���˻�
 */
	private ArrayList<Account> accounts;
	//private Account[] account;
	//private int NumOfCustomers;

	Customer(String f, String l) {	
		this.firstName = f;
		this.lastName = l;
		this.accounts = new ArrayList<>();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void addAccount(Account a) {
		this.accounts.add(a);
	}
	
	public Account getAccount(int b) {
		return this.accounts.get(b);
	}
	
	public int  getNumOfAccounts() {
		
		return this.accounts.size();
	}
	
	public int compareTo(Customer customer) {
		if (!firstName.equals(customer.firstName)) {
            return lastName.compareTo(customer.lastName);
        } else {
            return firstName.compareTo(customer.firstName);
        }
	}
}
