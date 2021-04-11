package day09_controlFlowStatements_Part3;

public class laptopModels {

	public static void main(String[] args) {
		
		String computer= "acer";
		
		switch(computer) {
		
		case "dell":
	        System.out.println("Though one");
	        System.out.println("Code Java");
	        break;
		case "Apple":
			System.out.println("Apple-no virus");
			System.out.println("Code Java");
			break;
		case "acer":
			System.out.println("Not recommended");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("do not buy that one!");
		}
         
	}

}
