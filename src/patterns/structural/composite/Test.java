package patterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<ToDo> toDoChest = new LinkedList<>();
		toDoChest.add(new ToDo("Cest Press"));
		toDoChest.add(new ToDo("Fly Machine"));
		toDoChest.add(new ToDo("Barber incline chest press"));
		
		Project projectOne = new Project("Chest WorkOut", toDoChest);
		projectOne.getHtml();
		
	}
		
}
