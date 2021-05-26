package day29_arraysLab;

public class Lab4_Question19 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints the total of the numbers in the array,except ignore sections of numbers starting 
		//with a 6 and extending to the next 7(every 6 will be followed by at least one 7).
		
		int[] x = {1,2,2}; 
	    int[] y = {1, 2, 2, 6, 99, 99, 7};  
	    int[] a = {1,1,6,7,2}; 
	    int[] b = {1,1,6,2};
	    int[] c = {1,2,2,6,99,99,7,3,4}; 

	    int sum = 0;
	    boolean boolCheckSix = false;
	    for(int i=0;i<a.length;i++) {
	    	
	    	if(boolCheckSix) {
	    		
	    		if(a[i] == 7) {
	    			boolCheckSix = false;
	    		}
	    	}else if(a[i]==6){
	    		boolCheckSix = true;
	    		
	    	}else {
	    		sum = sum + a[i];
	    	}
	    }
	    System.out.println(sum);
	}
    
}
