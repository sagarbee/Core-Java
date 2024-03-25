package StaticInititalizers;

public class StaticBlock {

	static
	{
		System.out.println("Inside static block 1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
	
	}
	
	static
	{
		System.out.println("Inside static block 2");
	}
}
