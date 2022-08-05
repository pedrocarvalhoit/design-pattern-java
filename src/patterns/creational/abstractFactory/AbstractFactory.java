package patterns.creational.abstractFactory;

public class AbstractFactory {

	public abstract class Factory {
		//The Factory specify just the Product A or B, and don´t say which
		//concret product are creating
		
		ProductA getProductA() {
			return null;
		}
		
		ProductB getProductB() {
			return null;
		}
		
	}

	public class ConcretFactory1 {
		ProductA getProductA() {
			return null;
		}
		
		ProductB getProductB() {
			return null;
		}
	}

	public class ConcretFactory2 {
		ProductA getProductA() {
			return null;
		}
		
		ProductB getProductB() {
			return null;
		}
	}
	
	public abstract class ProductA{}
	
	public abstract class ProductB{}
	
	public class ConcreteProductA1{}
	
	public class ConcreteProductA2{}
	
	public class ConcreteProductB1{}
	
	public class ConcreteProductB2{}

}
