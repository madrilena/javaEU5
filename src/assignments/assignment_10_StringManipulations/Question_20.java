package assignments.assignment_10_StringManipulations;

public class Question_20 {

	public static void main(String[] args) {
		
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
