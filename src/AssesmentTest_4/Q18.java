package AssesmentTest_4;

public class Q18 {

	public static void main(String[] args) {
		
		//Which line will print the string MUM?
		
		String s = "MINIMUM";
        
		System.out.println(s.substring(4,7)); //1
		System.out.println(s.substring(5));
		System.out.println(s.substring(s.indexOf('I',3))); //3
		System.out.println(s.substring(s.indexOf('N')));    //4
	}

}
