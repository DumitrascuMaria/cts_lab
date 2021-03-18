package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.NotificationService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Account a=new Account(); //nu se poate instantia o clasa abstracta
		
		CurrentAccount c=new CurrentAccount(300,"IBAN1"); //upcasting
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount account2=new CurrentAccount(200,"IBAN2");
		//dependecy inversion=modulele cele mai abstracte sa nu depinda de cele mai complexe
		SaveingAccount account3=new SaveingAccount(300,"IBAN3");
		System.out.println("Suma disponibila este: " +c.getBalance()); //=>0
		System.out.println("Creditul maxim pentru cont curent este "+CurrentAccount.MAX_CREDIT);
		c.deposit(200);
		System.out.println("Suma disponibila este: " +c.getBalance()); //=>200
		try {
			c.withdraw(200);
			c.transfer(100, account2);
			c.setNotificationService(new NotificationService(){

				@Override
				public void sendNotification(String message) {
					System.out.println("Sent PUSH notification with message"+message);
					
				}
				
			});
			c.withdraw(100);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} 
		System.out.println("Suma disponibila este: " +c.getBalance()); 
		System.out.println("Suma in contul2 este:" +account2.getBalance());
		System.out.println("Suma in contul3 este:" +account3.getBalance());
		((SaveingAccount)account3).addInterest(10);
		//account3.deposit(200);
		
		System.out.println("Suma in contul3 este:" +account3.getBalance());
		Bank banca=new Bank();
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT); //upcasting
		
	}

}
