package exercise2;

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

class Account {
	
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


/**
 * 
 *  SavingsAccount ��̳��� Account ��
 *
 */
class SavingsAccount extends Account {

	double interestRate;
	
	public SavingsAccount(double balance, double interest_rate) {
		super(balance);
		// TODO �Զ����ɵĹ��캯�����
	}
}

/**
 * 
 *  CheckingAccount ��̳��� Account ��
 *   ���� withdraw ����������͸֧����
 *
 */
class CheckingAccount extends Account {
	
	@SuppressWarnings("unused")
	private double overdraftProtection;
	public CheckingAccount(double balance) {
		super(balance);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public CheckingAccount(double balance, double protect) {
		super(balance);
		// TODO �Զ����ɵĹ��캯�����
		overdraftProtection = protect;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			return true;
		}
		else {
			if(amount <= balance + overdraftProtection) {
				balance = 0;
				overdraftProtection = overdraftProtection + balance - amount;
				return true;
			}
			else
				return false;
		}
	}
}