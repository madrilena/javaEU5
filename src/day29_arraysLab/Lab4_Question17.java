package day29_arraysLab;

public class Lab4_Question17 {

	public static void main(String[] args) {
		
		      //Write a method that accepts an array and print the difference between the largestand smallest values in the array.
		
		     int[] x = {10,3,5,6}; 
		     int[] y = {7,2,10,9};
		     int[] z= {2,10,7,2};

		     System.out.println(difference(x));
		     System.out.println(difference(y));
		     System.out.println(difference(z));
	}
    public static int difference(int[] arr) {
    	//finding the biggest
    	int max = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		
    		if(arr[i]>max) {
    			
    			max = arr[i];
    		}
    	}
    	// finding the smallest
    	int min=max;
    	for(int i=0;i<arr.length;i++) {
    		
    		if (arr[i]<min) {
    			min=arr[i];
    		}
    	}
    	
    	return max-min;
    }
    	
    	
    	
    }
