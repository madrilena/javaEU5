package day14_methods_Part2;

public class Lab_1Question1 {

	public static void main(String[] args) {
		/*Write a method that accept a string and a non-negative number,and prints a larger string
		that is number copies of the original String 
    
        stringTimes("Hi", 2); = > HiHi
		stringTimes("Hi", 3); = > HiHiHi
		stringTimes("Hi", 1); = > Hi
        */
		
		stringTimes("Hi",15);
		
	}
       public static void stringTimes(String x ,int num) {
    	  for(int i=1; i<=num; i++) {
    		   System.out.print(x);
          }
    	    
      // public static void stringTimes(String x ,int num) { 
      //  String str= "";
      // for(int i=1;i<=num;i++) { 
      //     str= str + x;      //"" + hi = hi + hi = hihi + hi = hihihi
      // }
      //    System.out.println(str); 
    	   
       }
}
