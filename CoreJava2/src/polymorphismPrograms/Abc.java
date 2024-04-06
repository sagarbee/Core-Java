package polymorphismPrograms;

public class Abc {
	
//	4.Variable Shadowing
	public static String str1 = "Variable Inside Abc";
	public static String str2 = "Static Variable Inside Abc";
	
	public String test(String str) {
		System.out.println("Method inside Abc");
		return str;
	}
}
