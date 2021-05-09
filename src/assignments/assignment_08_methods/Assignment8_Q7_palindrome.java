package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q7_palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Is the number Palindrome? Enter the number: ");
		
		int num=sc.nextInt();
		
		isPalindrome(num);
		System.out.println(isPalindrome(num));
		
		sc.close();

	}
	
	public static boolean isPalindrome(int num) {
		
		int remainder, original, reverse=0;    
		original=num;
		
		  while(num>0){
			  
		   remainder=num%10;    
		   reverse=(reverse*10)+remainder;   
		   num=num/10;
		  }   
		  
		  if(original==reverse) {
			  return true;
			  
		  }else   {
			  return false;
		  }
	}
}
