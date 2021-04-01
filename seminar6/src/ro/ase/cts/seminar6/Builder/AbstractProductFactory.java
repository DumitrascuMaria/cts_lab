package ro.ase.cts.seminar6.Builder;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct(int id)throws UnsupportedOperationException;
	public abstract String getCatalog();
}
