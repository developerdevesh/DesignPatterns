package com.codeball.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;


/**
 * Composite
 * 
 * @author devesh.singh
 *
 */
public class CompanyDirectory implements Employee {

	private List<Employee> list = new ArrayList<>();

	@Override
	public void showEmployeeDetails() {
		for (Employee emp : list) {
			emp.showEmployeeDetails();
		}

	}

	public void addEmployee(Employee emp) {
		list.add(emp);
	}

	public void removeEmployee(Employee emp) {
		list.remove(emp);
	}

}
