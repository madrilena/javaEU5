package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Qu10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number=sc.nextInt();
		
		isEven(number);
		System.out.println("Is even number? " + isEven(number));
		
		sc.close();

	}
	public static boolean isEven(int num) {
		
		if (num%2!=0 || num==1) {
			return false;
			
		}else {
			return true;
		}
	}	

}
