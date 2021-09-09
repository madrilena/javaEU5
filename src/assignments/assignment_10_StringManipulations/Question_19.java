package assignments.assignment_10_StringManipulations;

public class Question_19 {

	public static void main(String[] args) {
		
		/*
		 * Return the number of times that the string "java" appears anywhere in the given string word.

	Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3
     
		 */
		
		String input= "javaxjavaapplepearjavaegg";
		String str="java";
		
		times(input, str);
		System.out.println(times(input, str));

		
	}
	
		public static int times(String input,String str) {
			
			int counter=0;
			
			for(int i=0;i<=input.length()-str.length();i++) {
				
				if(input.substring(i,i+str.length()).equals(str)) {
					
					counter++;	
				}
			}
			
			return counter;
			
		}
		
}
