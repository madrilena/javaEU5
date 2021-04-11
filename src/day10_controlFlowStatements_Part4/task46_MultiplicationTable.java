package day10_controlFlowStatements_Part4;

import java.util.Iterator;

public class task46_MultiplicationTable {

	public static void main(String[] args) {
		
		int num=7;
		
		System.out.println("Multiplication table for 7");
		System.out.println("------------------------------");
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num + "*" + i + "=" + (num*i));
			System.out.println("------------------------------");
			
			
		}

	}

}
