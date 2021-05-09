package day15_methods_Part3;

public class task71_MethodOverloading {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(100);

	}
       public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
    	   
    	   if (feet<0 || (inches<0 || inches>12)) { //inches 0-12
    		  System.out.println("invalid feet or inches");
    	      return -1;
    	   }
    	   
    	   double centimeters = (feet*12) *2.54;
    	   System.out.println(feet + " feet," + inches + " inches=" + centimeters + " centimeters");
    	   
    	   return centimeters;
    	   
      }
      public static double calcFeetAndInchesToCentimeters(double inches) { //62 inches 5 ft 3 inches
    	  if (inches<0) {
    		  return -1;
    	  }
    	  
    	  double feet = (int)inches/12;
    	  double remainingInches = inches%12;
    	  System.out.println(inches + " inches= " + feet + " feet and "+ remainingInches + "inches");
    	  return calcFeetAndInchesToCentimeters(feet, remainingInches);
      }
      
      
       
       
       
}
       
