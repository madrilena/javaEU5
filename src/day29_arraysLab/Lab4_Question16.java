package day29_arraysLab;

public class Lab4_Question16 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints the number ofeven numbers in the array.

		int[] x = {2,1,2,3,4}; 
		int[] y = {2,2,0}; 
		int[] z= {1,3,5};
		
		System.out.println(countEvens(z));
	}
    public static int countEvens( int[] arr) {
    	
    	 int counter =0;
    	 for(int value : arr) {
    		 
    		 if(value%2==0) {
    			 
    			 counter++;
    		 }
    		 
    	 }
    			 
    	return counter;		 
    	 
    	 
    	 
    	
    }
}
