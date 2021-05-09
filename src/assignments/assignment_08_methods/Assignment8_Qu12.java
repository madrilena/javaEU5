package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Qu12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first boolean value:");
		boolean quote1=sc.nextBoolean();
		
		System.out.print("Enter the first boolean value:");
		boolean quote2=sc.nextBoolean();
		
		boolean result=hamletQuote(quote1, quote2);
		
		System.out.println("Outcome: " + result);
		
		sc.close();

	}
	public static boolean hamletQuote(boolean quote1, boolean quote2) {
		
		if (quote1==true || quote2==true) {
			return true;
		}else {
			return false;
		}
		
	}

}
