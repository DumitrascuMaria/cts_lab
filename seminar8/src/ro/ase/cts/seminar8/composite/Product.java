package ro.ase.cts.seminar8.composite;

public class Product extends CatalogComponent{
	String name;
	double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void add(CatalogComponent component) { //are sens doar in contextul unei colectii
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Can't add product");
	}

	@Override
	public void remove(CatalogComponent component) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Can't remove product");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" with price tag: "+this.price+"\n";
	}
	
	
	
	

}
