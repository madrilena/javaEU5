package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q1 {

	public static void main(String[] args) {
		
	plus();
	
	}
	
	public static void plus () {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter the first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter the second number:");
		int num2=sc.nextInt();
		
		System.out.println("Result is: " + (num1+num2));
		
		sc.close();
	}

}
