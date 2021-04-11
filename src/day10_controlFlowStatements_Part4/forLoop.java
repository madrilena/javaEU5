package day10_controlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {
		
        for(int i=0 ; i<5; i++) { 
        	
        	System.out.println("Hello");
        }
        
        //    i     condition    action         increment(i++) i= i+1
        //    0       TRUE       Print Hello        1
        //            TRUE       Print Hello        2
        //            TRUE       Print Hello        3
        //            TRUE       Print Hello        4
        //            TRUE       Print Hello        5
        
        //            FALSE
        
        for( int i=1; i<=10; i++) {
              System.out.println("i= " +i);
        }
        
        for(int i=5; i<=10; i++) {
        	  System.out.println("i= " +i);
        }
        
        for(int num=20; num>=10; num--) {
        	 System.out.println("num = " + num);
        }
        
        for(int i=0; i<=100; i+=10  ) {
        	 System.out.println("i = " + i);
        	
        }
        for(int i=50; i>=0; i-=5  ) {
       	 System.out.println("i = " + i);
        } 
	} 

}
