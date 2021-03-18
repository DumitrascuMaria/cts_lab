package ro.ase.ctsseminar2.interfaces;

import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public interface Withdrawable {
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}
