package day29_arraysLab;

public class Lab4_Question22 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints true if the number 1's is greaterthan the number 4's
		
		int[] x = {1,4,1}; 
		int[] y = {1,4,1,4}; 
		int[] z = {1,1}; 
          
		System.out.println(more14(z));
	}
    public static boolean more14(int[] arr) {
    	
    	 int counter1 = 0;
    	 int counter4 = 0;
    	
    	 for(int i=0;i<arr.length;i++) {
    		 
    		 if(arr[i] == 1) {
    			 counter1++;
    		 }else if(arr[i] == 4) {
    			 counter4++;
    		 }
    	 }
    	 if(counter1>counter4) {
    		 return true;
    	 }
    	 return false;
    }   
}
