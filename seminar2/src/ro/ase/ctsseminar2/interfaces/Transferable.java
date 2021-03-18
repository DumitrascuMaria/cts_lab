package ro.ase.ctsseminar2.interfaces;

import ro.ase.ctsseminar2.Account;
import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public interface Transferable {
	public abstract void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException;
}
