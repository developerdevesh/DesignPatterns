package com.codeball.designpatterns.composite;


/**
 * Client
 * 
 * @author devesh.singh
 *
 */
public class Company {

	public static void main(String[] args) {
		
	    Developer developer1 = new Developer("Devesh Singh",100, "Pro Developer");
	    Developer developer2 = new Developer("Ravish kwatra",101, "Senior Developer");
        
        CompanyDirectory developerDir = new CompanyDirectory();
        developerDir.addEmployee(developer1);
        developerDir.addEmployee(developer2);
           
        Manager manager1 = new Manager("Sunny",200, "Architech");
        Manager manager2 = new Manager("Nitin",201, "Vertical head");
           
        CompanyDirectory managerDir = new CompanyDirectory();
        managerDir.addEmployee(manager1);
        managerDir.addEmployee(manager2);
       
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(developerDir);
        directory.addEmployee(managerDir);
        directory.showEmployeeDetails();

	}

}
