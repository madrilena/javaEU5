package day13_methods_Part1;

public class task61_AgeCalculator {

	public static void main(String[] args) {
		
		ageCalculator (2021,1981);
		ageCalculator (2021,1961);
		ageCalculator (2021,1998);
		
	}
    public static void ageCalculator(int currentYear,int birthyear) {
    	int age =currentYear-birthyear;
    	
    	System.out.println(age);
    }
}
