package assignments.assignment_08_methods;

public class Assignment8_Q4 {

	public static void main(String[] args) {
		
	printHollowRect();
		
	
	}
	public static void printHollowRect() {
		
		for (int i=1; i<=5; i++) {
			
			if (i==1 || i==5) {
				
				for (int j=1; j<=5; j++) {
					System.out.print("*");
			}		
			}else if (i>=2 && i<=4) {
				
				for (int j=1; j<=5; j++) {
					
					if(j==1 || j==5) {	
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					}
				}
			}
		System.out.println();
		}
	}
		
}
