package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	
	public static double MAX_CREDIT=5000;//VAR STATICA=nu apartin unei instante ale clase, ci ale clasei insine
	
	public CurrentAccount() {
		super(); //se refera la instanta parinte
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);//putem sa accesam atribute din cls parinte cat si metode din cls parinte
	}

	@Override
	public void deposit(double amount) { //overloading=putem avea intr o clasa mai multe functii cu nr param dif, sau tipul param sa fie dif
	   //metoda modifica suma pe care o avem in cont la momentul respectiv
		//this.setBalance(getBalance()+amount);
		this.balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(this.balance>=amount) {
		this.balance-=amount;
		}
		else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
		
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}
	

	

	

}
