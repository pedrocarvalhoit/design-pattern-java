package patterns.behavioral.state;

public interface IGateState {
	
	void enter();
	
	void pay() ;
	
	void payOk();
	
	 void payFailed();

}
