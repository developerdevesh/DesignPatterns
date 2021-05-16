package com.codeball.designpatterns.template;

public class GlassHome extends HomeTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building glass walls");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building glass pillars");
		
	}

	
	
}
