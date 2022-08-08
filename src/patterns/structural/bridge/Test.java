package patterns.structural.bridge;

import patterns.structural.bridge.resource.ArtistResource;
import patterns.structural.bridge.resource.BookResource;
import patterns.structural.bridge.view.LongForm;
import patterns.structural.bridge.view.MediumForm;

public class Test {

	public static void main(String[] args) {
		
		ArtistResource jhonLegend = new ArtistResource("Cause all of me\r\n"
				+ "Loves all of you\r\n"
				+ "Love your curves and all your edges\r\n"
				+ "All your perfect imperfections", "https://pt.wikipedia.org"
						+ "/wiki/John_Legend#/media/Ficheiro:\r\n"
						+ "John_Legend_2019_by_Glenn_"
						+ "Francis.jpg", "John Legend", "https://pt.wikipedia.org/wiki/John_Legend#Discografia");
		
		LongForm longFormView = new LongForm(jhonLegend);
		longFormView.show();
		
		BookResource designPatterns = new BookResource("The authors discuss the tension between \r\n"
				+ "inheritance and encapsulation at length and state\r\n"
				+ " that in their experience, designers overuse inheritance\rn"
				+ "(Gang of Four 1995:20). The danger is stated as follows:", "https://en.wikipedia.org/wiki/Design_Patterns#/media\r\n"
						+ "/File:Design_Patterns_cover.jpg", "Design Patterns\r\n"
								+ "","https://en.wikipedia.org/wiki/Design_Patterns");
		
		MediumForm mediumFormView = new MediumForm(designPatterns);
		//mediumFormView.show();
		
	}
	
	

}
