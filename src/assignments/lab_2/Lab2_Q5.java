package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the charge:");
		
		double charge=sc.nextDouble();
		
		totalCharge(charge);
		
	}
	public static void totalCharge(double charge) {
		
		double tax=charge/100*6.75;
		double tip=(charge+tax)/100*20;
		double totalCharge=charge+tax+tip;
		
		System.out.println("Meal charge: $"+ charge);
		System.out.println("Tax amount: $" + tax + ", " + "Tip amount: $" + tip);
		System.out.println("Total charge: $" + totalCharge);	
	}

}
