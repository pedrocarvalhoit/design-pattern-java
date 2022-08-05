package patterns.behavioral.observer;

public interface Iobservable {
	
	void add(Iobserver observer);
	
	void remove(Iobserver observer) ;
	
	void notiFy();

	
	

}
