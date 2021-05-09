package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Qu13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter units used:");
		
		double units=sc.nextDouble();
		
		double result=waterTax(units);
		
		System.out.println("Total: " + result);
		
		sc.close();

	}
	
	public static double waterTax(double units) {
		
		double bill=0;
		
		if (units <=50) {
			bill= units*0.60;
			
		}else if (units>50 && units<=100){
			bill =units*0.90;
			
		}else if (units>100 && units<=150) {
			bill=units*0.90+50;
			
		}else if (units>150) {
			bill=units*0.90+100;
			
		}return bill;
	}

}
