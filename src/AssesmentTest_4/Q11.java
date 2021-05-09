package AssesmentTest_4;

public class Q11 {

	public static void main(String[] args) {
		
		String space = " ";
		String composite = space + "hello" + space + space;
		composite.concat("world");//it is not assigning. it is nothing
		String trimmed = composite.trim();
		
		System.out.println(trimmed.length());

	}

}
