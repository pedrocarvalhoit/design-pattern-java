package patterns.behavioral.command;

public class Test {

	public static void main(String[] args) {
		
		//In this example the client who has the lamp can chose which command 
		//he will execute for each button pressed at the Control.
		
		//Using just the lamp
		LampReceiver lamp1 = new LampReceiver();
		lamp1.off();
		
		//Using the just the Command
		ComandOnConcrete comand1 = new ComandOnConcrete(lamp1);
		comand1.execute();
		
		System.out.println("---Remot Control");
		//Using the Control
		InvokerControl controller = new InvokerControl(new ComandOnConcrete(lamp1),
				new ComandOffConcrete(lamp1), new ComandDownConcrete(lamp1), 
				new ComandUpConcrete(lamp1));
		controller.ClickOn();
		controller.ClickOff();
		
	}

}
