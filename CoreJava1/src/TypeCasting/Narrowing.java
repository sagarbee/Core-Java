package TypeCasting;

public class Narrowing {

/* 
 * 1. Narrowing is process of converting or storing larger primitive data type into smaller primitive data type.
 * 2. It does not done implicitly by java compiler.
 * 3. we can achieve it using typecast operator.
 * 4. Typecast operator is a Miscellaneous Operator.
 * 5. we can use it to perform both widening and narrowing.
 * 6. It is mandatory to  use when narrowing the data.
 * 7. syntax of Narrowing is (data type to be converted) and then value or expression.
 * 8. for example suppose we want to convert byte b data into char type of data then 
 * 		byte b = 123;
 * 		char c = (char)b;
 *   
 */
	
	public static void main(String[] args) {
		
		//127 - num = ans till it is less than 127 and greater than -128 then 128-ans+1 = final value of given type.	
		short s1 = 131;
		byte b1 = (byte) s1;
		System.out.println("short to byte of "+s1+" : "+b1); //short to byte of 130 : -126
		
		short s2 = -256;
		byte b2 = (byte) s2;
		System.out.println("short to byte of "+s2+" : "+b2);
		
		
		boolean b3 = false;
//		long l1 = (long) b3; Cannot cast from boolean to long
		
		int i1 = 123;
		float f1 = i1; //widening
		System.out.println("int to float of "+i1+" : "+f1);
		
		int i2 = (int)f1; //narrowing
		System.out.println("float to int of"+f1+" : "+i2);
		
		
	}
}
