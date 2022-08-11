package patterns.behavioral.state;

public class ClosedState  implements  IGateState{
	
	Gate gate;
	
	public ClosedState(Gate gate) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub
		
	}

}
