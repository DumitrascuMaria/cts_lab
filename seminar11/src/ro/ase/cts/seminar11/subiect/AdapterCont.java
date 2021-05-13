package ro.ase.cts.seminar11.subiect;

public class AdapterCont implements BankAccountInterface, ContBancar{

	private double total=500;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		// TODO Auto-generated method stub
		total-=suma;
		destinatie.depune(suma);
		System.out.println(suma+" de lei a fost transferata ->adapter");
		
	}

	@Override
	public void depune(double suma) {
		// TODO Auto-generated method stub
		total+=suma;
		System.out.println(suma+" a fost depusa ->adapter");
		
	}

	@Override
	public void accountTransfer(BankAccountInterface banckAccount, double amount) {
		// TODO Auto-generated method stub
		this.transfer(this, amount);
		
	}

	@Override
	public String toString() {
		return "AdapterCont [total=" + total + "]";
	}

}
