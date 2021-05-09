package assignments.lab_2;

import java.util.Scanner;

public class Lab2_Q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of cookies:");
		
		int cookies=sc.nextInt();
		calories(cookies);
		System.out.println("Calory: " + calories(cookies));

	}
	public static int calories(int cookies) {
		
		int caloryPerCookies=(300*10)/40;
		int calory=caloryPerCookies*cookies;
		return calory;
	}

}
