package patterns.behavioral.state;

//All states will have this interface
public abstract class State {
	
	Player player;

	public State(Player player) {
		this.player = player;
	}
	
	public abstract String onLock();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();
	
	
	

}
