package assignments.assignment_3_ArithmeticOperators;

public class Question_7 {

	public static void main(String[] args) {
		
		int dollars, price, quarters, dimes, nickles;
		dollars=1;
		price=95;
		quarters=(dollars*100-price)/25;
		dimes=(dollars*100-price)%25/10;
		nickles=(dollars*100-price)%25%10/5;
		
		System.out.println("Price in cents : " + price);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");

	}

}
