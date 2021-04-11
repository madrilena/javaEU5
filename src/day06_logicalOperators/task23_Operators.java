package day06_logicalOperators;

public class task23_Operators {

	public static void main(String[] args) {
		
		
		double a1 = 20;
		double a2 = 80;
		double res = (20+80)*25;
		double remainder = res%40;
		
		System.out.println(remainder);
		System.out.println(remainder  <= 20 );
		System.out.println("Remaining total is equal to 20 or less? -" + (remainder<=20));

	}

}
