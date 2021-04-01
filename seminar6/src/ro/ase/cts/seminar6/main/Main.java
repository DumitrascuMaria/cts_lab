package ro.ase.cts.seminar6.main;

import java.util.Scanner;

import ro.ase.cts.Singleton.Cart;
import ro.ase.cts.seminar6.Builder.AbstractProductFactory;
import ro.ase.cts.seminar6.Builder.Product;
import ro.ase.cts.seminar6.Builder.TechProductFactory;


public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart=Cart.getInstance("shopping");
//		Product smartphone=new TechProduct();
//		Product paperClip=new OfficeProduct();
//		myShoppingCart.products.add(smartphone);
//		myShoppingCart.products.add(paperClip);
		Scanner scan=new Scanner(System.in);
		System.out.println("Selectati categoria de produse:\n tech - Produse tech \n office - Produse office");
		String userPreference=scan.nextLine();
		Product myProduct=null;
//		if(userPreference.equalsIgnoreCase("tech")) {
//			myProduct=new TechProduct();
//		}else if(userPreference.equalsIgnoreCase("office")) {
//			myProduct=new OfficeProduct();
//		}else {
//			System.out.println("Optiune invalida");
//			System.out.println("Catalog produse:\n tech - Produse tech \n office - Produse office");
//			
//		}
		AbstractProductFactory productFactory=null;
		//ProductFactory productFactory=new ProductFactory();
		if(userPreference!=null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory=new TechProductFactory();
			}
		}
		myProduct=productFactory.makeProduct();
		
		if(myProduct!=null) {
			myShoppingCart.products.add(myProduct);
		}
		for(Product p:myShoppingCart.products) {
			System.out.println(p.getDescription());
		}

	}

}
