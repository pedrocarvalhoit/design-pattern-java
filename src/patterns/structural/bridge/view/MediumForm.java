package patterns.structural.bridge.view;

import patterns.structural.bridge.resource.IResource;

public class MediumForm extends View{
	
	public MediumForm(IResource resource) {
		super(resource);
	}

	public void show() {
		System.out.println(" You are on a tablet");
		System.out.println("  ");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("--                                   TITLE                                   --");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.resource.title());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("--  SNIPPET OF A SONG                                            --");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.resource.snippet());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("-- 	LINK OF A IMAGE                                                  --");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.resource.image());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("--  BIOGRAPHY                                                          --");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.resource.url());
	}

}
