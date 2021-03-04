package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public abstract class Account {
	//e abstracta, deci nu va putea fi instantiata, va servi drept sablon 
	
	public abstract void deposit(double amount); //nu are nicio implementare momentan deci o punem abstracta
	public abstract void withdraw(double amount) throws InsufficientFundsException ;
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();

}
