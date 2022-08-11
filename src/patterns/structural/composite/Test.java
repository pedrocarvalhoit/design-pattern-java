package patterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//Add the exercises in the program, and than printing it

		List<ToDo> toDoChest = new LinkedList<>();
		toDoChest.add(new ToDo("Chest Press"));
		toDoChest.add(new ToDo("Fly Machine"));
		toDoChest.add(new ToDo("Barber incline chest press"));
		
		Project projectOne = new Project("Chest WorkOut", toDoChest);
		projectOne.getHtml();
		
	}
		
}
