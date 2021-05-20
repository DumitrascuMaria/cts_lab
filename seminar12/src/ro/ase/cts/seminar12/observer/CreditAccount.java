package ro.ase.cts.seminar12.observer;



public class CreditAccount extends BankAccount implements Depositable,Withdrawable{

	//entitate Observabil concret
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
		for(NotificationInterface observer: this.observers) {
			observer.notifyUser(amount);
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
