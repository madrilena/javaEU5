package assignments.assignment_10_StringManipulations;

public class Question_18 {

	public static void main(String[] args) {
		
		/*
		 * Given two strings, word and a separator sep, 
		 * return a big string made of count occurrences of the word, separated by the separator string.

	Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
     
		 */
		
		String input1="Word";
		String input2="X";
		int occurrences=3;
		
		System.out.println(separator(input1, input2, occurrences));
			

	}
	
	public static String separator(String input1, String input2, int occurrences) {
		
		String output="";
		
		for(int i=0;i<occurrences;i++) {
			
			output=output+input1;
			
			if (i<occurrences-1) {
				
				output=output+input2;
			}
			
		}
		
		return output;
		
	}

}
