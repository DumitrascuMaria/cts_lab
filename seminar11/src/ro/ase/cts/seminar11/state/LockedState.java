package ro.ase.cts.seminar11.state;

public class LockedState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
		// TODO Auto-generated method stub
		System.out.println("You must authenticate yourself first!");
	}

	@Override
	public void authorize(Gate gate) {
		// TODO Auto-generated method stub
		System.out.println("User authorized to enter.");
		gate.setState(new OpenState());
		
	}

}
