package patterns.structural.decorator.ingredients;

import java.math.BigDecimal;

import patterns.structural.decorator.beverage.Beverage;

public class DecoratorCaramel  extends AddOnDecorator{
	
	private double cost = 2;
	private String description = ". Plus caramel border";
	private Beverage beverage;

	public DecoratorCaramel(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public double cost() {
		return this.beverage.cost() + this.cost;
	}
	
	public String description() {
		return this.beverage.description()+ this.description;
	}
	

}
