package day23_stringManipulationLab_randomClass;
public class Question_12 {

	public static void main(String[] args) {
	 
		String str = "catdog"; //counterCat
		                       //counterDog
		                       //substring(0,3)=i,i+3
                               //substring(3,6)=i,i+3
		
		int counterCat=0,counterDog=0;
		for(int i=0;i<str.length()-2;i++) {
			
			if(str.substring(i,i+3).equals("cat")) {
				counterCat++;
			}
			
			if(str.substring(i,i+3).equals("dog")) {
				counterDog++;
			}
			
		}
		if(counterCat==counterDog) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
   
   
}
