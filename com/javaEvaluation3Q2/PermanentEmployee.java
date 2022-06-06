package com.javaEvaluation3Q2;

public class PermanentEmployee extends Employee {
	private double basicPay	;
	public PermanentEmployee() {
		
	}
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicPay = basicPay;
	}
	
	public int calculateSalary() {
		
		double PF_amount = basicPay*0.12;
		
		int salary = (int)(basicPay - PF_amount); 
		setSalary(salary);
		return (Integer)null;
	}
	
	
}
