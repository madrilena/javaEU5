package day18_readingUserinput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.print("Provide a sentence and I will repeat it:");
       String str = sc.next();
       System.out.print(str);
       
	   String str2 = sc.nextLine();
	   System.out.println(str2);
	}

}
