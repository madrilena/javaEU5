package live_review_sessions.week05;

public class PizzaOder {
	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		// order 159 pizza: medium, 2, 3
		double totalPrice = 0;

		for(int i=1; i <= 159; i++) {
			Pizza order = new Pizza();
			order.customizeOrder("medium", 2, 3);
			totalPrice += order.calculatePrice();
		}

		System.out.println(totalPrice);


	}

}
