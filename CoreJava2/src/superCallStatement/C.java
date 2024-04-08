package superCallStatement;

public class C extends B {

	public C()
	{
		super();
	}
	
	public static String str = "Inside C static";
	public String str1 = "Inside C";

	public void displayC() {
		
		//Call the member of immediate parent if we have more than one class with same attribute
		System.out.println(super.str); 
		System.out.println(super.str1);
	}
}
