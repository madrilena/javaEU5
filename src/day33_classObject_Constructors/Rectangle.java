package day33_classObject_Constructors;

public class Rectangle {
	
	//instance variables
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length * width);
		
	}
	
	//created aconstructor
	//accept 2 arguments type double
	public Rectangle(double a, double b) { 
		
		length = a;
		width = b;
		
	}
    
	public Rectangle() {
		length = 5.4;
		width = 2.7;
		
	}
	public Rectangle(int a,float b) {
		
	}
	
	/*
	my constructor with no argument - the other is default constructor
	public Rectangle() {
	//initialize the values
	//default values	
	*/
	
}
