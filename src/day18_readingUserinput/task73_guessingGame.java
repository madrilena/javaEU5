package day18_readingUserinput;

import java.util.Scanner;

public class task73_guessingGame {

	public static void main(String[] args) {
		
		int userInput;
		int secretNumber=8;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 and 20:");
		
		do {
			
			userInput=sc.nextInt();
			if(userInput<secretNumber) {
				System.out.print("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.print("Enter a smaller number:");
		    }else {
		    	System.out.print("Congrat you got it...");
		    }
			
			
		}while(userInput != secretNumber);
				
				

	}

}
