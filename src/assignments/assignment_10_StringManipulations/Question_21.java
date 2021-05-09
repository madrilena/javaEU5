package assignments.assignment_10_StringManipulations;

public class Question_21 {

	public static void main(String[] args) {
		
		String input="abXYabc";
		int wordLength=2;
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
