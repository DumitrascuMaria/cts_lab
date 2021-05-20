package ro.ase.cts.seminar12.main;

import java.util.ArrayList;

import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.BankAccount;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.InsufficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SmsNotification;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditAccount account=new CreditAccount();
		NotificationInterface smsNotificationService=new SmsNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------");
		ArrayList<CharacterMemento>saveList=new ArrayList<CharacterMemento>();
		GameCharacter myCharacter=new GameCharacter("Maria",100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: "+myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: "+myCharacter.getHitpoints());
		
		
	}

}
