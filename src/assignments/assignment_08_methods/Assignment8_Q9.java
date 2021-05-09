package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int x=sc.nextInt();
		
		System.out.print("Enter second number:");
		int max=sc.nextInt();
		
		max(x, max);
		System.out.println(max(x,max));
		
		sc.close();

	}
	public static int max (int num1, int num2) {
		
		if (num1>num2) {
			return num2;
			
		}else {
			return num1;
		}
	}

}
