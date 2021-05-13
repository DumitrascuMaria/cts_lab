package ro.ase.cts.seminar11.subiect;

public class SingleBanca { //+factory
	private String denumire;
	private String adresa;
	public static int NrConturi=0;
	
	private static SingleBanca INSTANCE;
	
	private SingleBanca(String denumire, String adresa) {
		this.denumire=denumire;
		this.adresa=adresa;
	}
	
	public static synchronized SingleBanca getInstance(String denumire, String adresa) {
		if(INSTANCE==null) {
			INSTANCE=new SingleBanca(denumire, adresa);
		}
		return INSTANCE;
	}
	
	public ContBancar createInstance(String tipCont) {
		ContBancar cont;
		switch(tipCont) {
		case "CREDIT":
			cont=new ContCredit();
			NrConturi++;
			break;
		case "DEBIT":
			cont=new ContDebit();
			NrConturi++;
		default:
			cont=null;
		}
		return cont;
	}
	

}
