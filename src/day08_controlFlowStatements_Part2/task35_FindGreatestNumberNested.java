package day08_controlFlowStatements_Part2;

public class task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		
		int n1=100;
		int n2=200;
		int n3=1000;

		if(n1>n2 && n1>n3) {
			System.out.println("n1 is biggest");
				
	    }else {
	    	
	    	if(n2>n3){ 
	    	     System.out.println("n2 is biggest");
		 	
			}else {
			      System.out.println("n3 is biggest");	
			}
		}
	}

}
