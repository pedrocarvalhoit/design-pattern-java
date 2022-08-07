package patterns.creational.singleton;

public class ChatRoom {
	
	private String name = "Pedro´s Chat";
	static private ChatRoom instance;
	
	private ChatRoom() {
		
	}
	
	public static ChatRoom getInstance() {
		if(instance == null) {
			instance = new ChatRoom();
		};
		return instance;
		
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
