/**
 * 
 *  CheckingAccount 类继承自 Account 类
 *   涵盖 withdraw 方法，增加透支保护
 *
 */

package domain;

public class CheckingAccount extends Account {
	
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