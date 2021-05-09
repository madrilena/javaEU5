package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		next3(sc.nextInt());
		
		sc.close();
		
	}
	public static void next3(int num1) {
		
		System.out.println("Next 3 are:\n" + ++num1 + " " + ++num1 + " " + ++num1);	
	}

}
