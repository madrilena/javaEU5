package day04_aritmeticOperators;


//This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		
		double regularWage; //The calculated regular wage
		double basePay=25; // The base pay
		double regularHours=40; //The hours worked less overtime
		double overtimeWages; //Overtime wages
		double overTimePay=37.5; //OverTime Pay rate
		double overTimeHours=10;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overtimeWages;
		 System.out.println("Wages for this week are $ " + totalWage);
		
		
		
		
		
		

	}

}
