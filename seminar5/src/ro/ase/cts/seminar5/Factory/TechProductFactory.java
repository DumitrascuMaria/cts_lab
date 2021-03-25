package ro.ase.cts.seminar5.Factory;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct(String productName) throws UnsupportedOperationException {
		return new TechProduct(productName);
	}

	@Override
	public String getCatalog() {
		// TODO Auto-generated method stub
		return "generic - Generic tech product";
	}

}
