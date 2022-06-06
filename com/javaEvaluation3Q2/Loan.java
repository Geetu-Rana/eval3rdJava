package com.javaEvaluation3Q2;

public class Loan {
	
	
	public double calculateLoanAmt(Employee emplyeeObj){
			if(emplyeeObj instanceof PermanentEmployee) {
				Employee p1 = new PermanentEmployee();
				double loan_amt = p1.getSalary()*15/100;
				return loan_amt;
			}else if(emplyeeObj instanceof TemporaryEmployee) {
				Employee t1 = new TemporaryEmployee();
				double salary =t1.getSalary()*10/100;
				return salary;
			}else {
				return (Double) null;
			}
}
	
	
}
