package day9_controlFlowStatements_Part3;

public class switchRules {

	public static void main(String[] args) {
		
		final String lastName="Smith";
		String firstName="Mike";
		int id=0;
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		case lastName:
			id=5;
			break;
		//case 5:
		//	break;
			
		}
		
	}

}
