package day29_arraysLab;

public class Lab4_Question18 {

	public static void main(String[] args) {
		
		//Write a function that accepts an array and prints the sum of the numbers in the array.
		//Except the number 13 is very unlucky, so it does not count and numbers that comeimmediately after a 13 also do not count
      
		int[] x = {1,2,2,1}; 
		int[] y = {1,1}; 
		int[] a = {1,2,2,1,13}; 
		int[] b = {1,2,2,1,13,3}; 
		
		int sum=0;
		for(int i=0;i<b.length;i++) {
			if(b[i] !=13) {
				sum=sum+b[i];
			}else {
				break;
			}
			
		}
		System.out.println(sum);
	}
    
}
