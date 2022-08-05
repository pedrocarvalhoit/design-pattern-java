package patterns.structural.decorator.ingredients;

import patterns.structural.decorator.beverage.Beverage;

public abstract class AddOnDecorator extends Beverage{
	
	//This class HAS a beverage, and this class IS a beverage
	
	private double cost;
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
