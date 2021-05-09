package day24_arrays_part1;

import java.util.Scanner;

public class task87_Days {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] days = new String [7];
		
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		System.out.print("Enter your day index number : ");
        int index = sc.nextInt();
        
        System.out.println("Today is " + days[index]);
	}

}
