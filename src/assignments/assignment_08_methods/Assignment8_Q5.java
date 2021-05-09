package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Q5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		sign(sc.nextInt());
		
		sc.close();

	}
	public static void sign(int num) {
		
		if (num==0) {
			System.out.println(num);
		}else if (num>0) {
			System.out.println("1");
		}else {
			System.out.println("-1");
		}
	}

}
