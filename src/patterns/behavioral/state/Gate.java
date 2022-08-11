package patterns.behavioral.state;

public class Gate {
	
	 IGateState state;

	public Gate(IGateState state) {
		this.state = state;
	}

	public void enter() {
		this.state.enter();
	}
	
	public void pay() {
		this.state.pay();
	}
	
	public void payOk() {
		this.state.payOk();
	}
	
	public void payFailed() {
		this.state.payFailed();
	}

	public void chageState(IGateState gs) {
		this.state = gs;
	}

}
