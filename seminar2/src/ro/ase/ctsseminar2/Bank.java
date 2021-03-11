package ro.ase.ctsseminar2;

public class Bank {

	public static int nextId;
	
	public BankAccount openBankAccount(AccountType tipCont) {
		if(tipCont ==AccountType.CURRENT) {
			return new CurrentAccount();
		}else if(tipCont==AccountType.SAVINGS) {
			return new SaveingAccount();
		}else {
			throw new UnsupportedOperationException(); //exceptie din pachetul javalang
		}
	}
}
