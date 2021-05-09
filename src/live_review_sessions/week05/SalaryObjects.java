package live_review_sessions.week05;

public class SalaryObjects {

	public static void main(String[] args) {
		
		//System.out.println(salary1);

		Salary2 salary2 = new Salary2(); // employee2 :  hourlyRate = $55, weeklyHour = 45 hours
		salary2.setInfo(55, 45, 0.28);

		System.out.println(salary2);  //toString method gets executed automatically

		System.out.println("------------------------------------------");
		// employee2 hourlyRate = $65
		salary2.rate = 65;

		System.out.println(salary2);


		
		
		
	}

}
