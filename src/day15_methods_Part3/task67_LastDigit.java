package day15_methods_Part3;

public class task67_LastDigit {

	public static void main(String[] args) {
		//Write a method that accepts 2 numbers and return if they have the same last digit.

		/*Sample Output
		lastDigit(7,17)->true
		lastDigit(6,17)->false
		lastDigit(3,113)->true
		*/
      if(lastDigit(7,17)) {
    	  System.out.println(true);
      }else {
    	  System.out.println(false);
      }
		
		
	}
      private static boolean lastDigit(int num1, int num2) {
		if((num1%10)==(num2%10)) {
			return true;
		}else {
			
		}   return false;
		   
	}
	
    	  
      
}
