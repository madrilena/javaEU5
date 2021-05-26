package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question7 {

	public static void main(String[] args) {
		int[] x = {1,2,3};  
		int[] y = {};             
		int[] a = {7,4,6,2};
		int[] b = {};  
		
		 System.out.println(Arrays.toString(firstLast(x, y)));
		 System.out.println(Arrays.toString(firstLast(a, b)));
	}
    public static int[] firstLast(int[] arr1, int[] arr2) {
    	arr2 = new int[2];
    	arr2[0] = arr1[0];
    	arr2[1] = arr1[arr1.length-1];
    	
    	return arr2;
    		
    }
    
}
