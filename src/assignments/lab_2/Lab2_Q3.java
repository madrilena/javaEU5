package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive and nonzero number:");
		
		int number=sc.nextInt();
		
		sumUpTo(number);

	}
	public static void sumUpTo(int number) {
		
		int sum=0;
		for (int i=1; i<=number; i++) {
			
			sum=sum+i;		
		}
		System.out.println(sum);
	}

}
