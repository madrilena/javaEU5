package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q8_fibo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		
		fib (sc.nextInt());
		
		sc.close();
		
		
	} 
	public static void fib (int count) {
			
			int pre1 = 0, pre2 = 1;
			int sumOfPrevTwo=0;
			
			if (count==1) {
				System.out.println("Output: " + pre1);
				
			}else if (count==2) {
				System.out.println("Output: " + pre2);
				
			}else {
				
				for (int i = 3; i <= count; ++i){
		    		
					   sumOfPrevTwo = pre1 + pre2;
					   pre1 = pre2;
					   pre2 = sumOfPrevTwo;
				}
				System.out.println("Output: " + sumOfPrevTwo);
			}		
	}
}
