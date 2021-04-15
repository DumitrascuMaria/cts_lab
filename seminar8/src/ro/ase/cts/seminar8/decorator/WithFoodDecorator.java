package ro.ase.cts.seminar8.decorator;

public class WithFoodDecorator extends AbstractBackPackDecorator{

	String food;
	public WithFoodDecorator(AbstractBackPack basicBackpack) {
		super(basicBackpack);
		// TODO Auto-generated constructor stub
	}

	public WithFoodDecorator(AbstractBackPack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		this.basicBackpack.pack();
		System.out.print(" +"+getFood());
		
	}
	public String getFood() {
		return this.food;
	}

}
