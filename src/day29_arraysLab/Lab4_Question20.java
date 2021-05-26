package day29_arraysLab;

public class Lab4_Question20 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints true if the array contains a 2 nextto a 2 somewhere.

		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2}; 
		int[] a = {2,1,2}; 
		int[] b = {2,2,1,2}; 
		
		boolean flag = false;
		
		for(int i=0;i<a.length-1;i++) { 
			
			if(a[i]==2 && a[i+1]==2) {
				flag = true;
				break;
			}
		}
		
		
		if(flag) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
	}

}
