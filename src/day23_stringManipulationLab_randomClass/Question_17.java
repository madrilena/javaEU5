package day23_stringManipulationLab_randomClass;

public class Question_17 {

	public static void main(String[] args) {
		
		String str = "madam"; // <--tersten
		String str1 ="mom"; 
		
		String dummy="";
		//forwardString.equals(backwardString)=true
		// last m + a + d + a + m
		//      4   3   2   1   0
		// m + o + m 
		// 2   1   0
		
		for(int i =str.length()-1;i>=0;i--) {
			
			dummy = dummy + str.charAt(i);    //"" + m
			                                  //m + a = ma
			                                  //ma + d = mad
			
		}
        
		if (str.equals(dummy)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
