package patterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Project implements ToDoList{
	//Composite of ToDo´s
	
	String title;
	List<ToDo> toDo = new LinkedList<>();

	public Project(String title, List<ToDo> toDo) {
		this.title = title;
		this.toDo = toDo;
	}
	//Html from each project
	public String getHtml() {
		System.out.println("<html> ");
		System.out.println("<head>");
		System.out.println("<title> " + this.title + " </title>");
		System.out.println("</head>");
		System.out.println(" ");
		System.out.println("<body> ");
		System.out.println("<ul> ");
		
		for(int i = 0; i < this.toDo.size(); i++) {
			System.out.println("<li> " + this.toDo.get(i).getHtml() + " </li>");	
		}
		
		System.out.println("</ul> ");		
		System.out.println("</body>");
		System.out.println("</html> ");
		return null;
	}
	
	
}

