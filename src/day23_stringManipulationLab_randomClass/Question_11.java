package day23_stringManipulationLab_randomClass;

public class Question_11 {

	public static void main(String[] args) {
		
		String str = "abc hi hohihi";    //hi 2  //hihello = substring(0,2)
		                               //xhihello = substring(1,3)
		                               //xxhihello = substring(2,4)
		int counter=0;
		for(int i=0; i<str.length()-1;i++) {
			
			if(str.substring(i, i+2).equals("hi")) {   //if that code equal to hi
				
				
				counter++;
				
				
			}
		}
          
		System.out.println(counter);
	}

	
	
}
