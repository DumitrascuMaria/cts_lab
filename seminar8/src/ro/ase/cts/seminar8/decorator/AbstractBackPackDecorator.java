package ro.ase.cts.seminar8.decorator;

public abstract class AbstractBackPackDecorator extends AbstractBackPack {
	protected AbstractBackPack basicBackpack;

	public AbstractBackPackDecorator(AbstractBackPack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}
	
	
}
