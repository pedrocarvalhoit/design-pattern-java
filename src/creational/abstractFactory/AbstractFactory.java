package creational.abstractFactory;

public class AbstractFactory {

	public abstract class Factory {
		ProductA getProductA() {
			return null;
		}
		
		ProductB getProductB() {
			return null;
		}
		
	}

	public class ConcretFactory1 {}

	public class ConcretFactory2 {}
	
	public abstract class ProductA{}
	
	public abstract class ProductB{}
	
	public class ConcreteProductA1{}
	
	public class ConcreteProductA2{}
	
	public class ConcreteProductB1{}
	
	public class ConcreteProductB2{}

}
