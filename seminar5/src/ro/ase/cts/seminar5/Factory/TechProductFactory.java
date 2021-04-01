package ro.ase.cts.seminar5.Factory;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {
		// TODO Auto-generated method stub
		return "generic - Generic tech product";
	}
	

}
