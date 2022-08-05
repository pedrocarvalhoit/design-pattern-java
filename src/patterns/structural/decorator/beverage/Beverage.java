package patterns.structural.decorator.beverage;

import java.math.BigDecimal;

public abstract class Beverage {
	
	private String description;
	private double cost;
	
	public Beverage() {
		
	}

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public abstract double cost();
	
	public abstract String description();

	
	
}
