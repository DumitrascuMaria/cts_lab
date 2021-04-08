package ro.ase.cts.seminar7.adapter;

public class AdapterMetric implements MovableImperial{//vrem sa trecem de la metric la imperial

	private EuropeanCar euroCar;
	private final double multiplier=0.609344d;
	public AdapterMetric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	@Override
	public int getMaxSpeed() {
		return kmToMiles();
	} 
	
	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed()*multiplier);
	}

}
