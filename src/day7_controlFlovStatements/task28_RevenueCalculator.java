package day7_controlFlovStatements;

public class task28_RevenueCalculator {

	public static void main(String[] args) {
		 
		double price=100;
		int quantity=60;		
        double revenue;
        double discount=0;
        
        revenue=price*quantity;
         
        if(revenue>5000) {
        	
        	discount=revenue*0.1;
        	revenue=revenue-discount;
        	
        }
        System.out.println("revenue = " + revenue);
        System.out.println("discount = " + discount);
        
        	
        	
	}

}
