package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int number=sc.nextInt();
		int largest=0;
		int smallest=number;
		
		do {
			
			System.out.print("Enter your next number: ");
			number=sc.nextInt();
			
			if (number>largest) {
				largest=number;
					
			}else if (number<smallest) {
				smallest=number;
			}
			System.out.print("Do you want to enter another number?");
						
		}while (sc.nextInt()==1);
		
		System.out.println("Smallest number is:" + smallest);
		System.out.println("Largest number is: " + largest);

	}

}
