package patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		station.setTemperature(45);
		
		PhoneDiplay phone1 = new PhoneDiplay("124", "Peter´s Phone", station);
		PhoneDiplay phone2 = new PhoneDiplay("125", "Ana´s Phone", station);
		PhoneDiplay phone3 = new PhoneDiplay("126", "Barbara´s Phone", station);
		ComputerDisplay computer1 = new ComputerDisplay("127", "Paulo´s Computer", station);
		
		station.add(phone1);
		station.add(phone2);
		station.add(phone3);
		station.add(computer1);
		
		//Now Observers are aways receving the temperature data from Observable
		List listObservers = station.getObservers();
		listObservers.stream()
			.forEach(System.out::println);
		
	
		
		
		

	}

}
