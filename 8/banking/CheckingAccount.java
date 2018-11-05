/**
 * 
 *  CheckingAccount ��̳��� Account ��
 *   ���� withdraw ����������͸֧����
 *
 */

package banking;

import banking.domain.OverdraftException;

public class CheckingAccount extends Account {
	
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