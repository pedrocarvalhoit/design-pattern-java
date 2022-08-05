package patterns.structural.decorator.beverage;

import java.math.BigDecimal;

public class ConcreteExpresso extends Beverage{
	
	private double cost;
	private String description;
	
	public ConcreteExpresso() {

	}
	
	@Override
	public double cost() {
		return 2;
	}

	@Override
	public String description() {
		return "Just pure and nice shot of coffe";
	}


	

}
