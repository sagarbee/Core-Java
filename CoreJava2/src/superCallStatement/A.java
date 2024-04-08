package superCallStatement;

public class A {

	public A()
	{
		super();
	}
	
	public String str = "Inside A";

	public void displayA()
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		System.out.println("From class A");
	}
}
