package day27_arrays_part4;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {
		
		String [][] pizzas = {
				
				{"pinneapple","pepperoni"},//row-0 each row is array.
				{"anchovies","mushroom","olives"}, //row-1
			    {"4 cheese"},
			    {"chicken","tomatoes","onioons"},	
			    {"green peppers","zuccini","brocoli","spinach","shrimp"}
			   
		};
		//System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("###FOR EACH LOOP###");
		for(String[] pizza : pizzas) {  //for each loop array cikartiyor disari.
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println("###FOR ITERATOR LOOP###");
		for(int row=0;row<pizzas.length;row++) {
			//for(int column=0;column<pizzas[row].length;column++) {
				System.out.print(pizzas[row].length );
			    System.out.println(Arrays.toString(pizzas[row]));
			   
		}
		System.out.println("-------------------"); 
		
        for(String value:pizzas[3]) {  //for each loop arraysiz
        	System.out.println(value);
        }
        
        int[][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};  //for each loop
        
        for(int[] group : students) {
        	for(int studentID : group) {
        		System.out.println(studentID);
        	}
        }
        
       
        
        
        
        
        
        
        
        
        
	}

}
