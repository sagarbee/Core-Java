package interfacePrograms;

public interface Calculator1 {

    //int a; -> Only initialization will not work because internally by default they are final,static and public
	final int a = 10;
	public final static String  str1 = "Hello 1";
	String  str2 = "Hello 2";

	//By default non static methods are public and abstract.
	int addition(int a, int b);
	public abstract int subtraction(int a, int b); // by default abstract
	public double division(int a, int b);
	public int multiplication(int a, int b);
	public double modulus(int a,int b);
	/*
	 * static non concrete method are not allowed 
	 * public static subtraction(int a,int b);
	 * 
	 * Non static concrete methods are not allowed 
	 * public int multiplication(int a,int b) 
	 * { 
	 * 	return a*b; 
	 * }
	 */
	
	default int square(int a)
	{
		return a*a;
	}
	/*
	 * Not necessary to implement it in implementation class. default method will not affect the class which are implementing this interface.
	 * when developer wants to add new method in interface but they are already implemented by programmers then to not affects those implementation 
	 * and providing new features we can use default methods. 
	 */
}
