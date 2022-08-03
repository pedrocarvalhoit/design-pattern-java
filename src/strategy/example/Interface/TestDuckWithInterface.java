package strategy.example.Interface;

import strategy.Duck;

public class TestDuckWithInterface implements QuackInterface, FlyInterface{

	public static void main(String[] args) {

		Duck wildDuck = new Duck("WildPeter");
		System.out.println(wildDuck);
		wildDuck.choseQuack(noQuacking);
		wildDuck.choseFly(jetFlying);
		
		System.out.println("----");
		
		Duck cityDuck = new Duck("City Joe");
		System.out.println(cityDuck);
		cityDuck.choseQuack(simpleQuacking);
		cityDuck.choseFly(simpleFlying);
			

	}

	@Override
	public void choseQuack(String quack) {
	}

	@Override
	public void choseFly(String fly) {	
	}

	

	
}
