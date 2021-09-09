package day34Constructors;

public class Light {
	
	  //instance variables
	int noOfWatts;
	boolean indicator;
	String location;
	
	//constructor/ 1
	public Light() {
		this(0,false);
	System.out.println("Returning from no-argument constructor no.1");	//for chaining
		
	}
	//2
	public Light (int watt,boolean ind) {
		this(watt,ind,"X");
		System.out.println("Returning from constructor no.2");
		
	}
     //right click, source... short cut
     //3
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
		
	}
	
	
	

}
