package ro.ase.cts.seminar4;

import java.util.ArrayList;

public enum SingletonEnum {
INSTANCE;
	public ArrayList<String> products;
	
	public ArrayList<String> getProducts(){
		if(products==null) {
			products=new ArrayList<String>();
		}
		return products;
	}
}
