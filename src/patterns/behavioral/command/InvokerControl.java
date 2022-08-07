package patterns.behavioral.command;

public class InvokerControl {

	ICommand on;
	ICommand off;
	ICommand up;
	ICommand down;

	public InvokerControl(ICommand on, ICommand off, ICommand uo, ICommand down) {
		this.on = on;
		this.off = off;
		this.up = up;
		this.down = down;
	}

	void ClickOn() {
		this.on.execute();
	}

	void ClickOff() {
		this.off.unexecute();
	}

	void ClickUp() {
		this.up.increase();
	}

	void ClickDown() {
		this.down.decrease();
	}

}
