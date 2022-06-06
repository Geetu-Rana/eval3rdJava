package com.javaEvaluation3Q1;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			System.out.println("Enter arr Num");
			for(int i=0; i<size; i++) {
				 arr[i]=sc.nextInt();
			}
			
			try {
			System.out.println("Enter the index of Element you want to print");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException AIO){
			System.out.println(AIO.getMessage());
		}catch(NumberFormatException NFE) {
			System.out.println(NFE.getMessage());
		}
			catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
