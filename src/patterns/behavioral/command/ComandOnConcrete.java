package patterns.behavioral.command;

public class ComandOnConcrete implements ICommand{
	
	LampReceiver lamp;
	
	public ComandOnConcrete(LampReceiver lamp) {
		this.lamp = lamp;		 
	}

	@Override
	public void execute() {
		this.lamp.on();
		
	}

	@Override
	public void unexecute() {
		this.lamp.off();
	}

	@Override
	public void increase() {
		this.lamp.lightsUp();
		
	}

	@Override
	public void decrease() {
		this.lamp.lightsDown();
	}
	
	

}
