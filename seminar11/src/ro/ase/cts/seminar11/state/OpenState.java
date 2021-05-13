package ro.ase.cts.seminar11.state;

public class OpenState implements GateStateInterface {

	@Override
	public void enter(Gate gate) {
		System.out.println("Entered successfullly");
		gate.setState(new LockedState()); //am intrat si usa se inchide in spatele nostru
	}

	@Override
	public void authorize(Gate gate) {
	System.out.println("Already authorize");
		
	}

}
