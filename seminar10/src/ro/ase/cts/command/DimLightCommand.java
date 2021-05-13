package ro.ase.cts.command;

public class DimLightCommand implements CommandInterface {
private LightBulb lightBulb;
	
	public DimLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightBulb.dimLight();
		
	}
}
