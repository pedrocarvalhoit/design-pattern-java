package patterns.behavioral.template;

public class Twitter extends Network{

	  public Twitter(String userName, String password) {
	        this.userName = userName;
	        this.password = password;
	    }
	
	@Override
	boolean logIn(String userName, String password) {
		System.out.println("\nChecking user's parameters");
		System.out.println("Name: " + this.userName);
		System.out.print("Password: ");
		for(int i = 0; i < this.password.length(); i++) {
			System.out.println("*");
		}
		 simulateNetworkLatency();
		 System.out.println("\n\nLogIn success on Twitter");
		return true;
	}

	@Override
	boolean sendData(byte[] data) {
		boolean messagePosted = true;
		if(messagePosted) {
			System.out.println("Message: " + new String(data)+ " was posted on TT.");
			return true;
		}else {
			return false;
		}
	}

	@Override
	void logOut() {
		System.out.println("User: '" + userName + "' was logged out from Twitter");
	}

	private void  simulateNetworkLatency() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
