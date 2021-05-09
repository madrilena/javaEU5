package assignments.assignment_10_StringManipulations;

public class Question_18 {

	public static void main(String[] args) {
		
		String input1="Word";
		String input2="X";
		int occurrences=3;
		
		String output="";
		
		for(int i=0;i<occurrences;i++) {
			
			output=output+input1;
			
			if (i<occurrences-1) {
				
				output=output+input2;
			}
			
		}
		
		System.out.println(output);

	}

}
