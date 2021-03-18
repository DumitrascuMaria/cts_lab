package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sent email notification with message: "+message);
		
	}

}
