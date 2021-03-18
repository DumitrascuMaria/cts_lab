package ro.ase.cts.seminar4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart myCart=ShoppingCart.getInstance();
		myCart=ShoppingCart.getInstance(); //nu mai intra pe if, returneaza instanta anterioara
	}

}
