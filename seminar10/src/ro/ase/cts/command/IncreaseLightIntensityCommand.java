package ro.ase.cts.command;

public class IncreaseLightIntensityCommand implements CommandInterface{
private LightBulb lightBulb;
	
	public IncreaseLightIntensityCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightBulb.increaseLightIntensity();
		
	}
}
