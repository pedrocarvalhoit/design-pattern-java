package creational.factoryMethod;

import java.awt.Dialog;

public class Test {

	private static DialogCreator dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindownDialogConcretCreator();
        } else {
            dialog = new HtmlDialogConcreteCreator();
        }
    }

	static void runBusinessLogic() {
		dialog.renderWindow();
	}

}
