package day15_methods_Part3;

public class task69_PrimeNumber {

	public static void main(String[] args) {
	    int number=36;
		if (isPrime(number)) {
			System.out.println(number + "is a prime number");
		}else {
			System.out.println(number + " is not prime number");
		}
		
	}
	
	public static boolean isPrime(int number) {
		boolean flag = true;
		if (number==0 || number ==1) {
			//false
			
		}else {
			
			for(int i=2;i<number;i++) {
				if(number%i==0) {
				     flag= false;
					break;
			     }
		    }
	    }
		return flag;
	}
}
