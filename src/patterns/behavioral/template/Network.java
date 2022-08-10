package patterns.behavioral.template;

/** Main social network class */

public abstract class Network {

	String userName;
	String password;

	Network() {
	}

	/** Publish a multiplataform data */
	public boolean post(String message) {
		// Authenticate before posting.
		// Authenticate method with login and password
		if (logIn(this.userName, this.password)) {
			// Send the post data.
			boolean result = sendData(message.getBytes());
			logOut();
			return result;
		}
		return false;
	}
	
	abstract boolean logIn(String userName, String password);
	abstract boolean sendData(byte[] data);
	abstract void logOut();

}
