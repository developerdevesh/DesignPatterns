package com.codeball.designpatterns.template;

public class WoodenHome extends HomeTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building wooden walls");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building wooden pillars");
		
	}

	
	
}
