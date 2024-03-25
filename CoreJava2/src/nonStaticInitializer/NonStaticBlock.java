 package nonStaticInitializer;

public class NonStaticBlock {

	static {
		{
			int a = 10;
			int b = 20;
			System.out.println(a+b);
			System.out.println("Inside static block");
		}
	}
	
	{ 
		
		System.out.println("Before main method");
	}
	
	public static void main(String[] args) {
		
		NonStaticBlock nb1 = new NonStaticBlock();
		NonStaticBlock nb2 = new NonStaticBlock();
		NonStaticBlock nb3 = new NonStaticBlock();
	}
	
	{
		System.out.println("After main method");
	}
}
