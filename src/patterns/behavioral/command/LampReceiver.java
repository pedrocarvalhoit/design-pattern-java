 package patterns.behavioral.command;

public class LampReceiver {
	
	public LampReceiver() {
		
	}
	
	void on() {
		System.out.println("Lights On");
	}
	
	void off() {
		System.out.println("Lights Off");
	}
	
	void lightsUp() {
		System.out.println("Lights on MAX");
	}
	
	void lightsDown() {
		System.out.println("Lights on MIN");
	}
	
	

}
