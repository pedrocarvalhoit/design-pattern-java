package patterns.structural.decorator;

import java.math.BigDecimal;

import patterns.structural.decorator.beverage.ConcreteCoffe;
import patterns.structural.decorator.beverage.ConcreteExpresso;
import patterns.structural.decorator.ingredients.DecoratorCaramel;
import patterns.structural.decorator.ingredients.DecoratorChocolate;

public class CoffeShopTest {
	public static void main(String[] args) {
		
		ConcreteExpresso expresso = new ConcreteExpresso();
		DecoratorCaramel expressoCaramel = new DecoratorCaramel(expresso);
		DecoratorChocolate expressoCarmelChocolate = new DecoratorChocolate(expressoCaramel);
		
		System.out.println("Your order: " + expresso.description());
		System.out.println("Order price : " + expresso.cost());
		System.out.println("---");
		
		System.out.println("Your order: " + expressoCaramel.description());
		System.out.println("Expresso whit caramel price: " + expressoCaramel.cost());
		System.out.println("---");
		
		System.out.println("Your order: " + expressoCarmelChocolate.description());
		System.out.println("Expresso whit caramel and chocolate price: " + expressoCarmelChocolate.cost());
		System.out.println("---");
		
		ConcreteCoffe coffe = new ConcreteCoffe();
		DecoratorCaramel coffeCaramel = new DecoratorCaramel(coffe);
		
		System.out.println("Your order: " + coffeCaramel.description());
		System.out.println("Order price : " + coffeCaramel.cost());		
		System.out.println("---");
		
		DecoratorChocolate coffeChocolateCaramel = new DecoratorChocolate(new DecoratorCaramel(new ConcreteCoffe()));
		System.out.println("Your order: " + coffeChocolateCaramel.description());
		System.out.println("Order price : " + coffeChocolateCaramel.cost());
		
	}

}
