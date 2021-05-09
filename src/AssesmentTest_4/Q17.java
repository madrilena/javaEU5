package AssesmentTest_4;

public class Q17 {

	public static void main(String[] args) {
		
		String str="";
		int k = m1(str.length());
		
         k+=3 + ++k; // k = k + 3 + ++k  = k = 1 + 3 + 2 = 6 
		
		System.out.println(k);
		

	}
       public static int m1(int i) { //i=0
    	   return ++i; // i burada 1 oluyor
       }
}
