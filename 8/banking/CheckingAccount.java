/**
 * 
 *  CheckingAccount 类继承自 Account 类
 *   涵盖 withdraw 方法，增加透支保护
 *
 */

package banking;

import banking.domain.OverdraftException;

public class CheckingAccount extends Account {
	
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
	
	public void withdraw(double amount) throws OverdraftException {
		if(amount <= balance) {
			balance = balance - amount;
		}
		else {
			if(amount <= balance + overdraftProtection) {
				balance = 0;
				overdraftProtection = overdraftProtection + balance - amount;
			}
			else
				throw new OverdraftException("Insufficient funds for overdraft protection", amount-balance);
		}
	}
}