package patterns.structural.decorator.ingredients;

import java.math.BigDecimal;

import patterns.structural.decorator.beverage.Beverage;

public class DecoratorChocolate  extends AddOnDecorator{
	
	private double cost = 0.8;
	private String descriptin = ". Plus big chocolate square";
	private Beverage beverage;

	public DecoratorChocolate(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public double cost() {
		return this.beverage.cost() + this.cost;
	}
	
	public String description() {
		return this.beverage.description() + this.descriptin;
	}

}
