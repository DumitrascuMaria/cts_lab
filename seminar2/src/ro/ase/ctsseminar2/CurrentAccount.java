package ro.ase.ctsseminar2;
//ctrl+shift+o :sterge importurile nefolosite
import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.Depositable;
import ro.ase.ctsseminar2.interfaces.NotificationService;
import ro.ase.ctsseminar2.interfaces.Transferable;
import ro.ase.ctsseminar2.interfaces.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable{

	
	public static double MAX_CREDIT=5000;//VAR STATICA=nu apartin unei instante ale clase, ci ale clasei insine
	public NotificationService notificationService;
	
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
	

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
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
		if(this.notificationService!=null) {
		this.notificationService.sendNotification("s-a extras suma"+amount);
		}
		}

	@Override
	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}
	

	

	

}
