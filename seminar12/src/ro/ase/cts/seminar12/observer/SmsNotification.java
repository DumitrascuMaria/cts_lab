package ro.ase.cts.seminar12.observer;

public class SmsNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS +" +amount+" extracted");
	}

}
