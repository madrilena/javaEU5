package day33_classObject_Constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	//cons 1
	public Mouse(int weight) {
		this(30,weight);//you calling constructor (first line is this)
		this.weight = weight;
	    System.out.println("JAVA");
	
	}

    //cons 2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}

    //cons 3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
		
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
		
	}
	
  
    	
    
}
