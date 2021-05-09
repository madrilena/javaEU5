package day22_stringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		//Mr. = > married man
		//Mrs. => married woman
		//Ms. => Some women
		//Dr. => Doctor man or woman
		//No title => Unknown status
		
		String name = "Dr. Jockson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms")) {
			System.out.println("some women");
				
		}else if(name.startsWith("Dr")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}
		
	}

}
