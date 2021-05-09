package AssesmentTest_4;

public class Q9 {
   
	public static void main(String[] args) {
	
		System.out.println("|"+FunCharSeq(" W ").concat("W")+"|");
		//                  | +   WOW                         |    =  |WOW|
    }	
	
     public static String FunCharSeq(String str) {
		
		str=str.trim(); //"W"
		str+="O";       //str=str+"O" = "WO"
		
		return str;
		 
	}
	  
	
	
	
}  


