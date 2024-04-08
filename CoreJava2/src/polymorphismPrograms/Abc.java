package polymorphismPrograms;

public class Abc {
	
//	4.Variable Shadowing
	public static String str1 = "Variable Inside Abc";
	public static String str2 = "Static Variable Inside Abc";
	
	public String test(String str) {
		System.out.println("Method inside Abc");
		return str;
	}
	
	public int square(int a)
	{
		System.out.println("RTP inside ABC");
		return a*a;
	}
	public int add(int a, int b, int c)
	{
		System.out.println("add inside abc");
		return a+b+c;
	}
}
