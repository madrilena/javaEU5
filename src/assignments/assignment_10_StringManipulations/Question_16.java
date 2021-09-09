package assignments.assignment_10_StringManipulations;

public class Question_16 {

	public static void main(String[] args) {
		
		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.

	Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false
		 */
	
		String str= "javapyhton";
		
		String str2="java";
		
				
		System.out.println(isJavaThere(str, str2));
  
	}
	
	public static boolean isJavaThere(String str, String str2) {
		
		boolean flag=false;
		
		if (str.length()>=4) {
			
			if(str.substring(0,4).equals(str2) || str.substring(1,5).equals(str2)) {
				flag=true;
			}
		}
		
		return flag;
	}

}
