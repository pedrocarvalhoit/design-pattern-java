package strategy;

import strategy.examples.Interface.FlyInterface;
import strategy.examples.Interface.QuackInterface;

public class Duck implements QuackInterface, FlyInterface{
	
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}

	public String display() {
		return "Display";
	}

	@Override
	public void choseQuack(String quack) {
		System.out.println(quack);
		}

	@Override
	public void choseFly(String fly) {
		System.out.println(fly);		
	}
	
	@Override
	public String toString() {
		return "Hiii, my name is: " + name;
	}

}
