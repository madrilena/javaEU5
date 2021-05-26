package day28_arrays_Lab;

public class Lab4_Question12 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};        
		int[] y= {1,3}; 
	
		int[] z = {7,2,3};        
		int[] t = {1}; 
		
		int[] a = {3,2,4};        
		int[] b = {4,3,4}; 
		
		System.out.println(start1(x,y));
		System.out.println(start1(z,t));
		System.out.println(start1(a,b));
		
	}
    public static int start1(int[] arr1,int[] arr2) {
    	
    	int counter = 0;
    	
    	if (arr1[0] == 1) {
    		counter++;
    		
    	}
    	if(arr2[0] == 1) {
    		counter++;
    		
    	}
    	return counter;
    }
}
