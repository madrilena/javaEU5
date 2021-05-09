package day15_methods_Part3;

public class task68_Retirement {

	public static void main(String[] args) {
		/*Write two methods:
		 1-calculateAge(yearbirth);and returns the age
		 2-yearsUntilRetirement(name,year);and displays in the console following:"Mike retires in 36 years
		 */
		 
		 yearsUntilRetirement("Mike",1981);
        
	}
	public static void yearsUntilRetirement(String name,int year) { //name=MIKE year=1950
    	//retirement age = 65- age
    	int retirementAge = 65 - calculateAge(year);
    	System.out.println(name + " retires in " + retirementAge + " years");
    	
    }
	public static int calculateAge(int yearBirth) {
		   int age= 2021-yearBirth;
		   return age;
		   
    }
}
