package assignments.assignment_08_methods;

public class Assignment8_Qu17 {

	public static void main(String[] args) {
		
		boolean result=getThunderBlazz(false,true,9,7,3);
		System.out.println("Output: " + result);

	}
	
	public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 , int ingredient2, int ingredient3) {
		
		if (available==true || gift==true || (ingredient1==1 && ingredient2==2 && ingredient3==3) || (ingredient1==3 && ingredient2==1 && ingredient3==2) ) {
			return true;
		}else {
			return false;
		}
		
	}

}
