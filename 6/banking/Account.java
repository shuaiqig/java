package banking;

public class Account {
	
	protected double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	protected double getBalance() {
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


class Bank {
	
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


/**
 * 
 *  SavingsAccount 类继承自 Account 类
 *
 */
class SavingsAccount extends Account {

	double interestRate;
	
	public SavingsAccount(double balance, double interest_rate) {
		super(balance);
		// TODO 自动生成的构造函数存根
	}
}

/**
 * 
 *  CheckingAccount 类继承自 Account 类
 *   涵盖 withdraw 方法，增加透支保护
 *
 */
class CheckingAccount extends Account {
	
	@SuppressWarnings("unused")
	private double overdraftProtection;
	public CheckingAccount(double balance) {
		super(balance);
		// TODO 自动生成的构造函数存根
	}
	
	public CheckingAccount(double balance, double protect) {
		super(balance);
		// TODO 自动生成的构造函数存根
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
