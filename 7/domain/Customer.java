package domain;

public class Customer {
	
	private String firstName;
	private String lastName;
	
	
/**
 * 	����Customer�����飬ÿ���ͻ�������5���˻�
 */
	private Account[] account;
	private int NumOfCustomers;

	Customer(String f, String l) {
		
		this.firstName = f;
		this.lastName = l;
		account = new Account[5];
		NumOfCustomers = 0;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void addAccount(Account a) {
		
		account[NumOfCustomers] = a;
		NumOfCustomers++;
	}
	
	public Account getAccount(int b) {
		
		return account[b];
	}
	
	public int  getNumOfAccounts() {
		
		return NumOfCustomers;
	}
}
