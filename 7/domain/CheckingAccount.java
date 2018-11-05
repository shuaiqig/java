/**
 * 
 *  CheckingAccount ��̳��� Account ��
 *   ���� withdraw ����������͸֧����
 *
 */

package domain;

public class CheckingAccount extends Account {
	
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