package ro.ase.cts.seminar6.main;

import java.util.Scanner;

import ro.ase.cts.seminar6.Builder.AbstractProductFactory;
import ro.ase.cts.seminar6.Builder.Product;
import ro.ase.cts.seminar6.Builder.TechProduct;
import ro.ase.cts.Singleton.Cart;
import ro.ase.cts.seminar6.Builder.TechProductFactory;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");

		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse:\n Produse tech \n Produse office");
		String userPreferences = scan.nextLine();
		Product myProduct = null;

		AbstractProductFactory productFactory = null;
		if (userPreferences != null) {
			if (userPreferences.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}

		System.out.println(productFactory.getCatalog());
		//userPreferences = scan.nextLine();

		
			for(int i=0;i<2;i++) {
				userPreferences = scan.nextLine();
			try {
				int selectedId = Integer.valueOf(userPreferences);
				if(myShoppingCart.products.isEmpty()) {
					myProduct=productFactory.makeProduct(selectedId);
				}
				for(Product p: myShoppingCart.products) {
					if(p instanceof TechProduct)
					{
						TechProduct tempProduct=(TechProduct)p;
					
					if(tempProduct.getId()==selectedId) {
						try {
							myProduct=(Product) tempProduct.clone();
						} catch (CloneNotSupportedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						myProduct=productFactory.makeProduct(selectedId);
					}
					}
				}
				myProduct = productFactory.makeProduct(selectedId);
			} catch (NumberFormatException e) {
				System.err.println("Selectie invalida");
			}
		}
		
		if (myProduct != null) {
			myShoppingCart.products.add(myProduct);
		}

		for (Product p : myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}