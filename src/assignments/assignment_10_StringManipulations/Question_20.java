package assignments.assignment_10_StringManipulations;

public class Question_20 {

	public static void main(String[] args) {
		
		/*
		 * In mathematics, the factorial of a positive integer n, denoted by n!,  
		 * is the product of all positive integers less than or equal to n. 
		 * Calculate factorial and output result to the console.

	Sample Output:

     input: 5
     output: 120
		 */
		
		int input=5;
		
		factorial(input);
		
	}
    
	public static void factorial(int input) {
		
		int output=1;
		
		for(int i=1;i<=input;i++) {
			output= output*i;
			
		}
		
		System.out.println(output);

	}
}
