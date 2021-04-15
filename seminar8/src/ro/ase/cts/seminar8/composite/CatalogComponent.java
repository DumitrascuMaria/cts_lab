package ro.ase.cts.seminar8.composite;

public abstract class CatalogComponent {
	
	//nu trb neaparat abstracte
	public abstract void add(CatalogComponent component);
	public abstract void remove(CatalogComponent component);
	public abstract String getName();
	public abstract double getPrice();
		
	

}
