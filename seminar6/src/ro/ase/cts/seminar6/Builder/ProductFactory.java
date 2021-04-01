package ro.ase.cts.seminar6.Builder;

public class ProductFactory {

	public Product makeProduct(String type, String productName) throws UnsupportedOperationException{
		if(type.equalsIgnoreCase("tech")) {
			return new TechProduct.TechProductBuilder(0).getProduct(); //0 doar pt exxemplu, trebuia id in loc de productName
		}else if(type.equalsIgnoreCase("office")) { //getProduct() mereu trb apelata!!!
			return new OfficeProduct(productName);
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
