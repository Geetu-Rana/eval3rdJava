package com.javaEvaluation3Q2;

public class TemporaryEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hoursWorked;
		
	}
	
	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public void calculateSalary () {
		int salary = hoursWorked*hourlyWages;
		TemporaryEmployee t1 = new TemporaryEmployee();
		t1.setSalary(salary);
	}
	
	
}
