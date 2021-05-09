package assignments.assignment_10_StringManipulations;

public class Question_22 {

	public static void main(String[] args) {
		
		String input="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		if(input.contains("html")) {
			
			String result= input.substring(input.indexOf("\"")+1, input.lastIndexOf("\""));
			System.out.println(result);
			
		}else {
			System.out.println("Invalid input!");
		}
		
	}

}
