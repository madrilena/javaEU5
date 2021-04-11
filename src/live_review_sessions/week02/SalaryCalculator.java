package live_review_sessions.week02;

public class SalaryCalculator {

	public static void main(String[] args) {
		int hourlyRate = 50;//dolars per hour
		double taxRate = 0.3;
		int weeklyHour= 40; //hours in a week
		
		// annual salary before tax:
		int salary = (50*40) * 48;
		System.out.println("Your salary is: $ + salary");
		
		// total tax:
		double totalTax = salary* taxRate;
		System.out.println("Your total tax is: $"+totalTax);
		
		//salary after tax:
		double salaryAfterTax = salary-totalTax;
		System.out.println("Your salary after tax is: ");
		
		
		
		
		
		
		
		//Create a class called SalaryCalculator, write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rate
		
		
		
		
		
       // ex:
        	
        	
        	
               //  rate = 55;
              //  taxRate = 0.3;        
             //   weeklyHours = 40;
                
          //  then output will be:
                  //  your salary is: 105600 USD
                  //  your total tax is: 27456 USD
                  //  your income after tax is: 78144 USD

       // Assume that a year has 48 weeks (excluding PTO)
	}

}
