package strategy.examples.constructor;

import strategy.Duck2;

public class TestUsingConstructor {
	public static void main(String[] args) {
		
		Duck2 wildDuck = new Duck2("Wild Tom", "I can´t fly", "Quack quack");
		wildDuck.quack();
		wildDuck.fly();
		
	}

}
