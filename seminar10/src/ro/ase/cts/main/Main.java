package ro.ase.cts.main;

import ro.ase.cts.command.CommandInterface;
import ro.ase.cts.command.DimLightCommand;
import ro.ase.cts.command.IncreaseLightIntensityCommand;
import ro.ase.cts.command.LightBulb;
import ro.ase.cts.command.RemoteControl;
import ro.ase.cts.command.TurnLightOnCommand;
import ro.ase.cts.command.TurnOfLightCommand;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LightBulb bulb=new LightBulb(); //
		CommandInterface lightOnCommand=new TurnLightOnCommand(bulb);
		CommandInterface lightOffCommand=new TurnOfLightCommand(bulb);
		CommandInterface dimLightCommand=new DimLightCommand(bulb);
		CommandInterface increaseIntensityCommand=new IncreaseLightIntensityCommand(bulb);
		RemoteControl remote=new RemoteControl(lightOnCommand,lightOffCommand,dimLightCommand,increaseIntensityCommand);
		remote.pressLightOnButton();
		remote.pressIncreaseLightButton();
		remote.pressDimButton();
		
		
	}

}
