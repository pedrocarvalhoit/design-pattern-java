package patterns.structural.decorator.beverage;

import java.math.BigDecimal;

public class ConcreteCoffe extends Beverage{

	private double cost;
	private String description;
	
	public ConcreteCoffe() {

	}
	
	@Override
	public double cost() {
		return 3.5;
	}

	@Override
	public String description() {
		return "Big Brazilian made coffe";
	}

}

