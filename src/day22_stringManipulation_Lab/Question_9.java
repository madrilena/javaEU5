package day22_stringManipulation_Lab;

public class Question_9 {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));

	}
    public static String right2(String str) {
    	//Hello : lo substring(length()-2) + substring(0,length()-2)
    	
    	return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
    }
}
