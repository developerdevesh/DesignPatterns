package com.codeball.designpatterns;

import com.codeball.designpatterns.template.GlassHome;
import com.codeball.designpatterns.template.HomeTemplate;
import com.codeball.designpatterns.template.WoodenHome;

public class TestTemplatePattern {

	public static void main(String[] args) {
		
		HomeTemplate woodenHome=new WoodenHome();
		woodenHome.buildHome();
		
		System.out.println();
		
		HomeTemplate glassHome=new GlassHome();
		glassHome.buildHome();

	}

}
