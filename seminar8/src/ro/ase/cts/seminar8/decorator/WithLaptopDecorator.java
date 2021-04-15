package ro.ase.cts.seminar8.decorator;

public class WithLaptopDecorator extends AbstractBackPackDecorator{

	public WithLaptopDecorator(AbstractBackPack basicBackpack) {
		super(basicBackpack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
	    this.basicBackpack.pack();
	    System.out.print(" +Laptop");
		
	}



}
