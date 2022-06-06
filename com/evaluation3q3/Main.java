package com.evaluation3q3;

public class Main {
Month m;
public Main(Month m) {
		this.m =m;
	}
public void showDetails() {
		switch(m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FAB:
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case MAR:
			System.out.println("\"This is the 3nd Month of the Year March");
			break;
		case APR:
			System.out.println("This is the 2nd Month of the Year April");
			break;
		case MAY:
			System.out.println("\"This is the 3nd Month of the Year May");
			break;
		case JUNE:
			System.out.println("This is the 2nd Month of the Year June");
			break;
		case JULY:
			System.out.println("\"This is the 3nd Month of the Year July");
			break;
		case AUG:
			System.out.println("This is the 2nd Month of the Year August");
			break;
		case SEP:
			System.out.println("\"This is the 3nd Month of the Year September");
			break;	
		case OCT:
			System.out.println("This is the 2nd Month of the Year October");
			break;
		case NOV:
			System.out.println("\"This is the 3nd Month of the Year Nobember");
			break;
		case DEC:
			System.out.println("This is the 2nd Month of the Year December");
		default:
			System.out.println("This is the 1st month of this Year January");
	}
}
	public static void main(String[] args) {
		String str = "APR";
		Main m1 =new Main(Month.valueOf(str));
		m1.showDetails();
	}
}	


