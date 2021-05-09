package assignments.assignment_08_methods;

import java.util.Scanner;

public class Assignment8_Qu11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter buy price:");
		int buy=sc.nextInt();
		buyPrice(buy);
		
		System.out.print("Enter sell price:");
		int sell=sc.nextInt();
		sellPrice(sell);
		
		String result=c_profits(buyPrice(buy),sellPrice(sell));
		
		System.out.println("Status: " + result);
		
		sc.close();

	}
	
	public static int buyPrice(int buy) {
		return buy;
	}
	
	public static int sellPrice(int sell) {
		return sell;
	}
	
	public static String c_profits(int buy, int sell) {
		
		if (buy>sell) {
			return "loss";
		}else if (buy==sell) {
			return "no loss";
		}else {
			return "profit";
		}
	}
}
