package TypeCasting;

public class Widening {

/*
 *	1.It is classification of primitive typecasting.
 *	2.It is process of converting or storing smaller type of data into larger type of data is called as Widening.
 *	3.It is done implicitly by java compiler. 
 *	4.We can also perform it explicitly by using typecast operator.
 * 	5. byte |-> < short < int < long < float < double .
 * 			|-> < char
 *	6. boolean does not get typecast into other primitive type automatically.
 *	   and when we try to typecast it explicitly it will throw CTE.
 * Note: 
 * byte(-128 to 127)
 * short(-32,768 to 32,767)
 * char
 * int(-2,147,483,648 to 2,147,483,648)
 * 
 *  Does Java support ASCII or Unicode?
	Internally, Java uses the Unicode character set. 
	Unicode is a two-byte extension of the one-byte ISO Latin-1 character set, 
	which in turn is an eight-bit superset of the seven-bit ASCII character set.
 *
 *Q.can you do widening for byte to char type?
 *	->	yes although implicitly it is not possible but we use typecast operator to explicitly perform widening.
 *	
 *Q.why implicitly it is not possible?
 *	->	java widening refers to storing smaller type of data into 
 *		larger type of data to prevent loss of information. 
 *		However, not all widening conversion are allow by java language specification(JSL)  
 *		
 *		Implicitly widening of primitive data type is applied to either convert:
 *		1. byte	 to short,int,long,float,double
 *		2. short to int,long,float,double
 *		3. int to long float,double
 *		4. long to float,double
 *		5. float to double		
 */
	
	public static void main(String[] args) {
		
		byte b1 = 127;
		System.out.println("value1:"+b1);
		int i1 = b1;
		System.out.println("to int"+i1);
		
//		byte b2 = 200; Type mismatch: cannot convert from int to byte
//		int i2 = b2;
//		System.out.println(i2);
		
		byte b5 = -127;
		char c5 = (char)b5; //JSL does not allow implicit widening of byte to char but we can do it using typecast operator.
		System.out.println("byte to char of "+b5+" : "+c5);

//		byte b3 = -25;
//		System.out.println("value3: "+b3);
//		char c1 = b3;
//		System.out.println("to char: "+s1);
		
//		byte b4 = 65;
//		System.out.println("value4: "+b4);
//		char c2 = b4;
//		System.out.println("to char: "+c2);
//		
//		char c3 = 'z';
//		System.out.println("value5: "+c3);
//		byte b5 = c3;
//		System.out.println(b5);
		
		long l = 345678684l;
		System.out.println("value: "+l);
		double d = l;
		System.out.println("value"+d);
		
	}
	
	
}
