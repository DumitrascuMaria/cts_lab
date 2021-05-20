package ro.ase.cts.seminar12.observer;

import java.util.ArrayList;

public abstract class BankAccount extends Account { //banck mostenteste account
	//are toate metodele definite in cls account
	//insa fiind abstracta,nu este obligatoriu ca noi sa avem o definitie pt aceste metode
	
	//OBSERVABIL
	//colectie observatori
	protected ArrayList<NotificationInterface> observers;
	protected double balance;
	protected String iban;
	
	public BankAccount() {
		this.observers=new ArrayList<NotificationInterface>();
		this.balance=0;
		this.iban="";
	}
	
	public BankAccount(double balance, String iban) {
		this.observers=new ArrayList<NotificationInterface>();
		this.balance=balance;
		this.iban=iban; //this are o referinta catre obiectul curent 
	}
	
	//definirirea unei alte implementari decat ea din parinte=override
	//putem adauga o definitie pt toate metodele, sau doar partial
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	//incapsulare=fiecare atribut poate sa fie vizibil doar prin interiorul clasei marcat prin private
	//protected=atributul va fi vizibil doar pt clasele care extind clasele banckAcount
	//daca nu mentionam daca a public/private/... acela va fi vizibil la niv de pachet

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addObserver(NotificationInterface observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(NotificationInterface observer) {
		this.observers.remove(observer);
	}
	
	
	

}
