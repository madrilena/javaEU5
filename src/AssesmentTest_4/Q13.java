package AssesmentTest_4;

public class Q13 {

	public static void main(String[] args) {
		
		String str = "JavaScript";
		System.out.println(getMsg(str));
		
		
	}
	public static String getMsg(String x) {
		
		String msg = "Input value must be ";
		msg = msg.concat("smaller than x");
		msg.replace("X", x); // no assigned gecersiz.
		String rest = "and larger than 0";
		msg.concat(rest); // no assigned
		return msg;
	}

}
