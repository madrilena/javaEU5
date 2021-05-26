package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question6 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {11,5,9}; 
		int[] a = {110,5,98,0,1200,11,-4}; 
		
		System.out.println(Arrays.toString(maxEnd(x)));
		System.out.println(Arrays.toString(maxEnd(y)));
		System.out.println(Arrays.toString(maxEnd(a)));
	}
    public static int[] maxEnd(int[] arr) {
    	
    	int max = arr[0];
    	
    	for(int i=0;i<arr.length-1;i++) {
    		if(arr[i+1]>max) {
    			max = arr[i+1];
    		}
    	}
    	  for (int i=0;i<arr.length;i++) {
    		  arr[i] = max;
    	  }
    	  return arr;
    }     
    
   
}
