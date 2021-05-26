package day29_arraysLab;

public class Lab4_Question21 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints true if the sum of all 2's in the arrayis exactly 8

		int[] x = {2, 3, 2, 2, 4, 2}; 
		int[] y = {2, 3, 2, 2, 4, 2, 2};  
		int[] z = {1, 2, 3, 4}; 
		
		System.out.println(sum28(x));
	}
    
	public static boolean sum28(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == 2) {
				
				sum = sum + arr[i];
			}
		}
		if(sum == 8) {
			return true;
		}
		return false;
		
	} 
	
}
