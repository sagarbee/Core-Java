package superCallStatement;

public class B extends A {

	public static String str = "Inside B static";
	public String str1 = "Inside B";
	
	public void displayB() {
		System.out.println(super.str);
	}
}
