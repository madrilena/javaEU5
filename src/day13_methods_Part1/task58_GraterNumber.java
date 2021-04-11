package day13_methods_Part1;

public class task58_GraterNumber {

	public static void main(String[] args) {
		
		GraterNumber();

	}
    public static void GraterNumber() {
    	int num1= 10;
    	int num2= 5;
    	
    	if(num1>num2) {
    		System.out.println("num1 is greater");
    	}else if(num2>num1) {
    		System.out.println("num2 is greater");
    	}else {
    		System.out.println("numbers are equal");
    	}
    }
}
