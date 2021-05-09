package assignments.assignment_08_methods;

public class Assignment8_Qu16 {

	public static void main(String[] args) {
		
		boolean result=simpleRoomBook(true,7,2,2018);
		System.out.println("Availability of the room: " + result);

	}
	public static boolean simpleRoomBook(boolean a, int month, int day, int year) {
		
		if (a==true) {
			
			if (month==7) {
				
				if (day<1 && day>8) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}	
		}else {
			return false;
		}
	}

}
