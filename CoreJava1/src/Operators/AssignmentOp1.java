package Operators;

public class AssignmentOp1 {
/*
 * 1.Assignment operator is binary operator which is used to store value inside a variable.
 * 2.It works from right to left
 * 3. var = value/expression
 * 
 * Rules:
 * 			1.LHS of Assignment must be a variable otherwise we get CTE
 * 			2.Type of value to be store must be same as the type of variable created.
 * 			3.If type of value is not same as the variable type then there are two possibilities. Either it will throw CTE or get typecast
 */
	public static void main(String[] args) {
		
//		byte b1 = 200; CTE
		
		int i1 = 10;
//		byte b1 = i1;  CTE
//		System.out.println(b1);
		
		int intValue = 10;
		byte byteValue = (byte) intValue;  // Valid, byteValue = 10
		System.out.println(byteValue);
		
		
		double doubleValue = 10.5;
		int intValueFromDouble = (int) doubleValue;  // Valid, intValueFromDouble = 10
		System.out.println(intValueFromDouble);
		

	}

}
