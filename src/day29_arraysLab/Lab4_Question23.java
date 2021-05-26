package day29_arraysLab;

import java.util.Arrays;

public class Lab4_Question23 {

	public static void main(String[] args) {
		
		//Write a method that accepts a number and create and prints a new array of lengthnumber, containing the numbers 0,1,2,...number-1.
		
		System.out.println(Arrays.toString(fizzAray(8)));
	}
    public static int[] fizzAray(int x) {
    	int[] array = new int [x];
    	for (int i=0;i<array.length;i++) {
    		array[i]=i;
    	}
    	return array;
    }
}
