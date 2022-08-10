package patterns.structural.composite;

public class ToDo implements ToDoList{
	//This class is a leef
	
	String text;
	
	public ToDo(String text) {
		this.text = text;
	}

	public String getHtml() {
		return this.text;
	}
	

}
