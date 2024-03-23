package Operators.unary;

public class unary1 {
	
	/*
	 * 1. unary plus(+)
	 * 2. unary minus(-)
	 * 3. Increment(++)
	 * 4. Decrement(--)
	 * 5. Logical Complement(!)
	 * 6. Bitwise Complement(~)
	 * 
	 */
	
	
	public static void main(String[] args) {
		

		int x = 10;
		int y = +x;  // y will be 10
		System.out.println(y);
		
		int p = 10;
		int q = -p;  // q will be -10
		System.out.println(q);
		
		int a = 5;
		int b = -a;
		System.out.println(b);
		
		//Logical Complement	
		boolean c = true;
		boolean e = !c;
		System.out.println(e);
		
		//Bitwise Complement
		int f = 5;	// it makes o's to 1's and vice versa and then find 2's complement
		int g = ~f;;
		System.out.println(g);
		/*
		 * After the unary bitwise complement operation ~f, the variable g contains the value -6 because all the bits of f were inverted, 
		 * and then the inverted number was interpreted as a two's complement binary number to determine its decimal value.
		 */
		
	}
}
