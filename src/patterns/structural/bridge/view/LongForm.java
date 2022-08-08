package patterns.structural.bridge.view;

import patterns.structural.bridge.resource.IResource;

public class LongForm extends View{
	
	public LongForm(IResource resource) {
		super(resource);
	}
	 
	public void show() {
		System.out.println(" You are on a computer");
		System.out.println("  ");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("--                                   TITLE                                   --");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.resource.title());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("--  SNIPPET OF WORK                                              --");
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
