package day8_controlFlowStatements_Part2;

public class task31_Triangle {

	public static void main(String[] args) {
		
		//A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three
		// integers as angles and check whether a triangle is valid or not.

		int angle1=80;
		int angle2=30;
		int angle3=70;
		int sum=180;
		if(angle1+angle2+angle3 == sum) {
			
			System.out.println("Triangle is valid");
		}else {
			
			System.out.println("Triangle is not valid");
		}
		
	}

}
