package ro.ase.cts.seminar11.subiect;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleBanca singleBanca=SingleBanca.getInstance("BCR", "Centru");
		ContBancar contBancar=singleBanca.createInstance("CREDIT");
		ContBancar contBancar2=singleBanca.createInstance("DEBIT");
		
		System.out.println(contBancar);
		System.out.println(contBancar2);
		
		System.out.println(singleBanca.NrConturi);
		
		ContBancar adapterCont=new AdapterCont();
		System.out.println(adapterCont);
		adapterCont.transfer(contBancar, 200);
		System.out.println(adapterCont);
		adapterCont.depune(100);
		System.out.println(adapterCont);
		BankAccountInterface banckAccount=new AdapterCont();
		((BankAccountInterface)adapterCont).accountTransfer(banckAccount, 50);
		System.out.println(adapterCont);
		

	}

}
