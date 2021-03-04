package ro.ase.ctsseminar2;

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
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}
	

	

	

}
