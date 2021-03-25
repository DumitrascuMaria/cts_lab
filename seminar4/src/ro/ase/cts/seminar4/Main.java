package ro.ase.cts.seminar4;
import ro.ase.cts.seminar4.EagerShoppingCart;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleton
//		Cart myCart=Cart.getInstance();
//		myCart=Cart.getInstance(); //nu mai intra pe if, returneaza instanta anterioara
//		myCart.getProducts();
		
		//factory
		Cart shoppingCart=Cart.getInstance("shoppingCart");
		Cart wishList=Cart.getInstance("wishList");
		shoppingCart.getProducts();
		wishList.getProducts();
		
		
		
		
		//singleton in alta maniera
		EagerShoppingCart example=EagerShoppingCart.INSTANCE;
		EagerShoppingCart example2=EagerShoppingCart.INSTANCE;
		if(example==example2) {
			System.out.println("obiectele sunt identice");
		}
		
		SingletonEnum mySingleton=SingletonEnum.INSTANCE;
		mySingleton.getProducts();
	}

}
