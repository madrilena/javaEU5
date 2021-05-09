package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Qu14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first boolean value:");
		boolean a=sc.nextBoolean();
		
		System.out.print("Enter the second boolean value:");
		boolean b=sc.nextBoolean();
		
		System.out.print("Enter the third boolean value: ");
		boolean c=sc.nextBoolean();
		
		boolean result=threeLocks(a,b,c);
		System.out.println(result);
		
		sc.close();

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if (a==true && b==true || c==true) {
			return true;
		}else {
			return false;
		}
	
	}

}
