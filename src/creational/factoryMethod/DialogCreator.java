package creational.factoryMethod;

public abstract class DialogCreator {
	
	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}
	
	 public abstract Button createButton();
	

}
