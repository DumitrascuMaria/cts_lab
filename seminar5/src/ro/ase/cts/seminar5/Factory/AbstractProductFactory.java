package ro.ase.cts.seminar5.Factory;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct()throws UnsupportedOperationException;
	public abstract String getCatalog();
}
