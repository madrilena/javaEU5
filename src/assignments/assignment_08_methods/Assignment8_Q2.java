package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x=sc.nextInt();
		
		cube(x);
		
		sc.close();
		
	}
	
	public static void cube (int num) {
		
		int cube=num*num*num;
		System.out.println("Cube of the number is: " + cube);
		
	}
	
	

}
