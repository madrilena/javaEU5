package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of males:");
		double males=sc.nextDouble();
		
		System.out.print("Enter the number of females:");
		double females=sc.nextDouble();
		
		maleFemalePercentage(males, females);

	}
	public static void maleFemalePercentage(double males, double females) {
		
		double malesPercentage=(males/(males+females)*100);
		double femalesPercentage=(females/(males+females)*100);
		
		System.out.println("Males percentage is: " + malesPercentage);
		System.out.println("Females percentage is: " + femalesPercentage);
		
	}

}
