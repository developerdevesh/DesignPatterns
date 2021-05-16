package com.codeball.designpatterns.template;

/**
 * HomeTemplate
 * 
 * @author devesh.singh
 *
 */
public abstract class HomeTemplate {
	
	public final void buildHome(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("Home is built.");
	}

	private void buildWindows() {
		System.out.println("Building Windows");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Building foundation");
	}
}