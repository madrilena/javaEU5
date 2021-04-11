package day14_methods_Part2;

public class Lab_1question6 {

	public static void main(String[] args) {
		
		
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}
    public static void cigarParty(int numberCigar, boolean isWeekend) {
    	if(isWeekend) {
    		if(numberCigar>=40) {
    			System.out.println(true);
    		}else {
    			System.out.println(false);
    		}
    	}else {
    		if(numberCigar>=40 && numberCigar<=60) {
    			System.out.println(true);
    		}else {
    			System.out.println(false);
    		}
    	}
    }
}
