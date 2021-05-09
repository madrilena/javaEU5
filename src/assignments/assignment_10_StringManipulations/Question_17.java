package assignments.assignment_10_StringManipulations;

public class Question_17 {

	public static void main(String[] args) {
		
		String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String input1="a";
		String input2="z";
		
		String output="";
		
		if (letters.contains(input1) && letters.contains(input2)) {
			
			int beginIndex=letters.indexOf(input1);
			int endIndex=letters.indexOf(input2);
			
			output= letters.substring(beginIndex,endIndex+1);
			
		}else {
			
			letters=letters.toLowerCase();
			int beginIndex=letters.indexOf(input1);
			int endIndex=letters.indexOf(input2);
			
			output= letters.substring(beginIndex,endIndex+1);
			
		}
		
		
        System.out.println(output);
        
        
	}

}
