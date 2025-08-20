package com.sudarshan.assignment1.utilities;
import com.sudarshan.assignment1.employees.Developer;
import com.sudarshan.assignment1.employees.Employee;
import com.sudarshan.assignment1.employees.Manager;

public class EmployeeUtilities {
	public void displayEmp(Employee Emp)
	{
		System.out.println("Employee Name: "+Emp.getName());
		System.out.println("Employee Id: "+Emp.getEmpId());
		System.out.println("Employee Salary: "+Emp.getSalary());
		
	}
	
	public void displayMan(Manager Man)
	{
		displayEmp(Man);
		System.out.println("Department: "+Man.getDept());
	}
	
	public void displayDev(Developer Dev)
	{
		displayEmp(Dev);
		System.out.println("Programming Language: "+Dev.getLanguage());
	}
}
