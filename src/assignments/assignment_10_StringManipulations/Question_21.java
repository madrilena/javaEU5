package assignments.assignment_10_StringManipulations;

public class Question_21 {

	public static void main(String[] args) {
		
		/*
		 * Given a string, consider the prefix string made of the first n chars of the string. 
		 * Does that prefix string appear somewhere else in the string?
		Assume that the string is not empty and that n is in the range from 1 till str.length().

	Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only
		 */
		
		String input="abXYabc";
		int wordLength=1;
		String word=input.substring(0,wordLength);
		
		int counter=0;
		
		for(int i=0; i<=input.length()-wordLength;i++) {
			
			if(input.substring(i,i+wordLength).equals(word)){
				counter++;
			}
			
		}
         
		if(counter>1) {
        	 System.out.println(true);
         }else {
        	 System.out.println(false);
         }
	}
	
}
