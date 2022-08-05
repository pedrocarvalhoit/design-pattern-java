package patterns.behavioral.strategy;

public class Duck2 {
	
	private String name;
	private String flyBehavior;
	private String quackBehavior;
	
	public Duck2(String name, String flyBehavior, String quackBehavior) {
		this.name = name;
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public String getName() {
		return name;
	}

	public String getFlyBehavior() {
		return flyBehavior;
	}

	public String getQuackBehavior() {
		return quackBehavior;
	}
	
	public void fly() {
		System.out.println(this.flyBehavior);
	}
	
	public void quack() {
		System.out.println(this.quackBehavior);
	}
	
	
	

}
