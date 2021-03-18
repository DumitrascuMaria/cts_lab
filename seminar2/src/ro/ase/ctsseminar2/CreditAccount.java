package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.Depositable;
import ro.ase.ctsseminar2.interfaces.Transferable;
import ro.ase.ctsseminar2.interfaces.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable,Withdrawable{

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
		this.balance+=amount;
		}
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount>0) {
			this.balance-=amount;
			}
			
		
	}

//	@Override
//	public void transfer(double amount, Depositable destination)
//			throws IllegalTransferException, InsufficientFundsException {
//		// TODO Auto-generated method stub
//		throw new UnsupportedOperationException();
//		
//	}

}
