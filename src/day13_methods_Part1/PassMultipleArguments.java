package day13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		
		showSum(5,10);
		showSum(7,10);
		showSum(5,23);
		showSum(15,10);
	}
	
	
       public static void showSum(int num1,int num2) {
    	   System.out.println(num1+num2);

       }
}
