package day14_methods_Part2;

public class Lab_1Question3 {

	public static void main(String[] args) {
	//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.Write a method
	//that accepts a number and prints true if the given number is special.
	
		
	specialEleven(22);
	specialEleven(23);
	specialEleven(24);
		
	}
     public static void specialEleven(int num){
    	 if(num%11==0 || num%11==1 ) {
    		 System.out.println(true);
    	 }else {
    		 System.out.println(false);
    	 }
     }
}
