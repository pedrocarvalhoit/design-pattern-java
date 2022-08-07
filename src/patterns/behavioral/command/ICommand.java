package patterns.behavioral.command;

public interface ICommand {
	
	void execute();
	void unexecute();
	void increase();
	void decrease();

}
