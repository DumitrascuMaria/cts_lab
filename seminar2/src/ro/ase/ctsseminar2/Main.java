package ro.ase.ctsseminar2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Account a=new Account(); //nu se poate instantia o clasa abstracta
		
		//CurrentAccount c=new CurrentAccount(300,"IBAN1");
		//System.out.println("Suma disponibila este: " +c.getBalance()); //=>0
		System.out.println("Creditul maxim pentru cont curent este "+CurrentAccount.MAX_CREDIT);
	}

}
