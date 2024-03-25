package StaticInititalizers;

public class Static1 {
	
	static String firstName = "Sagar";
	
	public static void main(String[] args) {
		
		System.out.println(firstName+" inside main method");
		
	}
	//static block gets executed first
	static
	{
		System.out.println(firstName+" inside static block");
	}
	
	
}
