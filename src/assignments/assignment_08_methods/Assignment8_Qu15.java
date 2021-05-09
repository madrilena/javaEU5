package assignments.assignment_08_methods;

public class Assignment8_Qu15 {

	public static void main(String[] args) {
		
		boolean result=validateTask(false, 3,2);
		System.out.println(result);

	}
	
	public static boolean validateTask(boolean a, int num1, int num2) {
		
		if (a==true && num1==num2+1) {
			return true;
		}else {
			return false;
		}
	}

}
