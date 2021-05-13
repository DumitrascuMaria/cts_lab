package ro.ase.cts.command;

public class TurnLightOnCommand implements CommandInterface{
private LightBulb bulb;
	
	public TurnLightOnCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.turnOnLight();
	}
}
