package patterns.structural.bridge.view;

import patterns.structural.bridge.resource.IResource;

abstract class View {
	
	IResource resource;
	 
	public View(IResource resource) {
		this.resource = resource;
	}



	void show() {
	}

}
