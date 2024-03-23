package Operators;

public class ArithmeticOp1 {

	/*
	 * 1.Arithmetic Operator are used to perform basic arithmetic and mathematical operations on operands.
	 * 2.All Arithmetic operators are binary operator.
	 * 3.they are Addition(+),subtraction(-) , division(/), multiplication(*), modulus(%)
	 * 4.String get concat in with plus operator.It will throw CTE with other arithmetic operations.
	 * 5.boolean will throw CTE for all arithmetic operation
	 * 
	 *Note: 
	 * promotion rules defined in the Java Language Specification (JLS). 
	 * This behavior is a form of type promotion, which is intended to prevent the loss of information.
	 * Addition(Operation) of all byte or all short or all char store results into int type for byte and short. it is done implicitly by java compiler.
	 * Operation of all int -> int
	 * Operation of all int and long -> long
	 * all long -> long
	 * all long and float -> float
	 * all float -> float
	 * all float + double -> double 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
	
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 34;
		short s2 = 49;

//		short s3 = s1+s2;		
//		byte b3 = b1+b2; Addition store results into int type for byte and short. it is done implicitly by java compiler.
		
		int i1 = 34;
		int i2 = 93;
		int i3 = i1+i2;
		System.out.println(i3);
		
		String str1 = "Sagar";
		String str2 = "More";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		char ch1 = 'A'; //ASCII value 65
		char ch2 = 'z'; //ASCII value 122	
		System.out.println(ch1+ch2);
	}
}
