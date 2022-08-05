package patterns.creational.factoryMethod;

public class WindownDialogConcretCreator extends DialogCreator{

	@Override
	public Button createButton() {
		return new ConcreteWindowsButton();
	}

}
