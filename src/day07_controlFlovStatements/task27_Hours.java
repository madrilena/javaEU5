package day07_controlFlovStatements;

public class task27_Hours {

	public static void main(String[] args) {
		
		int hour=14;
	
		
		if(hour<12) { 
			System.out.println("Good Morning");
		}
		
		if(hour>=12 && hour<15) {
			System.out.println("Good Afternoon");
		}
		
		if(hour>=15) {
			System.out.println("Good Evening");
			 
		}
	}

}
