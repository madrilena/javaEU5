package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question14 {

	public static void main(String[] args) {
		
		//Write a method that accepts 2 arrays and prints a new array containing alltheir elements
		
		int[] x = {1,2};    int[]y={3,4}; 
		int[] z = {4,4};   int[] t = {2,2};  
		int[] m = {9,2};    int[] b = {3,4}; 
		
		int[] k = new int[m.length+b.length];
		
		for(int i=0;i<m.length;i++) {
			
			k[i]=m[i];
			
		}
         int a = 0;
         for(int j = m.length;j<k.length;j++) {
        	 
        	 k[j]=b[a];
        	 a++;
        	 
       }
         System.out.println(Arrays.toString(k));
   
    	
    }
	
}
