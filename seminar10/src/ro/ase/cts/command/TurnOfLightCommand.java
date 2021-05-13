package ro.ase.cts.command;

public class TurnOfLightCommand implements CommandInterface{

	private LightBulb lightBulb;
	
	public TurnOfLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightBulb.turnOffLight();
		
	}

}
