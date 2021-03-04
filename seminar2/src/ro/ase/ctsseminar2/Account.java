package ro.ase.ctsseminar2;

public abstract class Account {
	//e abstracta, deci nu va putea fi instantiata, va servi drept sablon 
	
	public abstract void deposit(double amount); //nu are nicio implementare momentan deci o punem abstracta
	public abstract void withdraw(double amount);
	public abstract void transfer(double amount, Account destination);
	public abstract double getBalance();

}
