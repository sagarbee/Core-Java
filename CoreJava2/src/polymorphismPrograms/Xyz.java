package polymorphismPrograms;

public class Xyz extends Abc {

//	4.Variable Shadowing

	public static String str1 = "Variable Inside XYZ";
	public static String str2 = "Static Variable Inside XYZ";

	public String test(String str) {
		System.out.println("Method inside Xyz");
		return str;
	}
}
