package com.codeball.designpatterns.composite;


/**
 * Manager |leaf|
 * 
 * @author devesh.singh
 *
 */
public class Manager implements Employee {

	private String name;
	private int empId;
	private String position;
	
	public Manager(String name, int empId, String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee details: "+empId+" "+name);
		
	}
	
	 
	
}
