package ro.ase.cts.seminar4;

public class EagerShoppingCart {
	public static final EagerShoppingCart INSTANCE;
	
	static { //blocul static e executat o sg data la runtinme
		INSTANCE=new EagerShoppingCart();
	}
	
	//toti constructorii sunt private
	private EagerShoppingCart() {}

}
