package com.javaEvaluation3Q2;

public class Main {
	
	public static void main(String[] args) {
		Loan l1 = new Loan();
		TemporaryEmployee t1= new TemporaryEmployee(101, "Pankaj", 10, 100);
		
		PermanentEmployee p1 = new PermanentEmployee(102, "Geetu", 1500);
		System.out.println(l1.calculateLoanAmt(t1));
		System.out.println(l1.calculateLoanAmt(p1));
		
	}
	
}
