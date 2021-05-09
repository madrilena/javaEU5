package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q6 {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount:");
			
		double amount=sc.nextDouble();
			
		totalSale(amount);
			
	}
	public static void totalSale(double amount) {
		
		double stateTax=amount/100*4;
		double countyTax=amount/100*2;
		double totalAmount=amount+stateTax+countyTax;
		
		System.out.println("Amount is: $" + amount);
		System.out.println("State tax is: $" + stateTax + ", County Tax is: $" + countyTax);
		System.out.println("Total tax is: $" + (stateTax + countyTax));
		System.out.println("Total amount is: $"  + totalAmount);
	}


}
