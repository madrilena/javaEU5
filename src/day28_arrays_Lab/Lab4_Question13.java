package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question13 {

	public static void main(String[] args) {
		
		int[] x = {1,2};    int[]y={3,4};   
		int[] z= {5,6};    int[] t = {3,8};   
		int[] a = {1,1};    int[] b = {1,0};  
         
		biggerTwo(x,y);
		biggerTwo(z,t);
		biggerTwo(a,b);
	}
    public static void biggerTwo(int[] arr1, int[]arr2) {
    	int sum1=0;
    	int sum2=0;
    	
    	for(int value : arr1) {
    		sum1=sum1+value;
    	}
    	for(int value : arr2) {
    		sum2=sum2+value;
    	}
    	
    	if(sum1>sum2) {
    		System.out.println(Arrays.toString(arr1));
    	}else if (sum2>sum1) {
    		System.out.println(Arrays.toString(arr2));
    	}else {
    		System.out.println("Equal");
    	}
    	
    }
}
