package ro.ase.cts.seminar11.subiect;

public class ContCredit implements ContBancar {

	private double total=1000;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		// TODO Auto-generated method stub
		total-=suma;
		destinatie.depune(suma);
		System.out.println(suma+" de lei a fost transferata ->credit");
		
		
	}

	@Override
	public void depune(double suma) {
		// TODO Auto-generated method stub
		total+=suma;
		System.out.println(suma+ " de lei a fost adaugata in contul curent ->credit");
		
	}

	@Override
	public String toString() {
		return "ContCredit [total=" + total + "]";
	}

}
