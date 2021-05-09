package day20_stringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {
		
		String str1 = "Apple";
		String str2 = new String("Apple");
		System.out.println(str1==str2); //same obj. degiller ve false
		System.out.println(str1.equals(str2)); //same value ,true
		
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2);//values same ,true
		boolean b2= s1.equals(s3);
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1==s2; //same object,true
		boolean b4 = s1==s3;
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java");
		System.out.println(s1==s4); //different object , false
		System.out.println(s1.equals(s4)); //same value,true
		
		
		
		
		
		
		

	}

}
