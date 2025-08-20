package com.sudarshan.assignment1;

import com.sudarshan.assignment1.employees.Developer;
import com.sudarshan.assignment1.employees.Employee;
import com.sudarshan.assignment1.employees.Manager;
import com.sudarshan.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
	
	public static void main(String[] args)
	{
		Developer d = new Developer();
		d.setEmpId(18);
	    d.setLanguage("JAVA");
	    d.setName("Rajesh");
	    d.setSalary(60000);
	    
		Manager m = new Manager();
		m.setDept("AI");
	    m.setEmpId(22);
	    m.setName("Sudarshan");
	    m.setSalary(45000);
	    
	    EmployeeUtilities eu = new EmployeeUtilities();
	    
	    //Manager details
	    System.out.println("Manager Information \n" );
	    eu.displayMan(m);
	    
	    System.out.println("Developer Information");
	    eu.displayDev(d);
		
	}
}
