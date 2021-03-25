package ro.ase.cts.seminar5.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.seminar5.Factory.Product;

//SINGLETON
public class Cart implements Serializable {

	private static Map<String,Cart> instances=null;
	private String type;
	public ArrayList<Product> products;
	
	private Cart() {
		products = new ArrayList<Product>();
	}

	public static synchronized Cart getInstance(String type) {
		if(instances==null) {
			instances = new HashMap<>();
		}
		if(!instances.containsKey(type)) {
			Cart myCart=new Cart();
			myCart.type=type;
			instances.put(type,myCart);
		}
		return instances.get(type);
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	
}

//SINGLETON
//public class ShoppingCart {
//
//	private static ShoppingCart instance=null;
//	private ShoppingCart() {}
//	public static ShoppingCart getInstance() {
//		if(instance==null) {
//			instance=new ShoppingCart();
//		}
//		return instance;
//	}
//	
//}