package day14_methods_Part2;

public class Lab_1Question4 {

	public static void main(String[] args) {
		
	//The deers in VA spend most of the day playing. In particular,they play if the temperature is between 60and90.Unless it is
	//summer,then the upper limit is 100 instead of 90.
    //Write a method that accepts temperature and a boolean isSummer,prints true if the deers play and false otherwise.
		
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		
	}
       public static void deerPlay(int temp, boolean isSummer) {
    	  if(isSummer) {
    		  if(temp>60 && temp<100) {
    			System.out.println(true);
    	      }else {
    		    System.out.println(false);
    	      }
          }else {
        	  if(temp>60 && temp<90) {
  			     System.out.println(true);
  	          }else {
  		          System.out.println(false);
    	  
              }
          }         
       }
}
