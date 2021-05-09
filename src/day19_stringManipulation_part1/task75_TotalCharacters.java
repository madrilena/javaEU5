package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {

	public static void main(String[] args) {
		
		//write a program that ask user to enter his/her firstname and lastname.Display in the console total number of characters.

	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your first name:");
		String firstName = sc.next();
		System.out.println("Enter your last name:");
		String lastName = sc.next();
	    System.out.println("Total characters in your first and last name is:" +((firstName.length())+lastName.length()) );
						
	}
	

}
