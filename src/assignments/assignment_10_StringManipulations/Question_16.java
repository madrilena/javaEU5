package assignments.assignment_10_StringManipulations;

public class Question_16 {

	public static void main(String[] args) {
	
		String str= "javapyhton";
		
		String str2="java";
		
		boolean flag=false;
		
		if (str.length()>=4) {
			
			if(str.substring(0,4).equals(str2) || str.substring(1,5).equals(str2)) {
				flag=true;
			}
		}
		
		System.out.println(flag);
  
	}

}
