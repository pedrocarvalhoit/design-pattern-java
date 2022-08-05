package creational.factoryMethod;

public class HtmlDialogConcreteCreator extends DialogCreator{

	@Override
	public Button createButton() {
		return new ConcreteWindowsButton();
	}

}
