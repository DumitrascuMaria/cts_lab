package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.interfaces.NotificationService;

public class SMSNotificationService implements NotificationService{
	public void sendNotification(String message) {
		System.out.println("Sent SMS notification with message:"+message);
	}

}
