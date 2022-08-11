package patterns.behavioral.state;

public class OpenState implements  IGateState{

	Gate gate;
	
	public OpenState(Gate gate) {
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payOk() {
		System.out.println("Free to go, you can enter.");
		this.gate.chageState(new ClosedState(this.gate));
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub
		
	}

}