package wrapperClass;

public class WrapperClass {

	
	public static void main(String[] args) {
		
		int primitive = 30;
		
		Integer nPrm1 = (Integer) primitive; //Upcasting primitive to non-primitive, done implicitly by compiler
		System.out.println(nPrm1);
		
		int prm1 = (int)nPrm1; //Unboxing
		int prm2 = nPrm1; //after jdk1.5 Auto-unboxing non-primitive to primitive
		
		Integer nPrm2 = new Integer(30);//Boxing it overrides all object class methods
		System.out.println(nPrm2);
		
		Integer nPrm3 = 34; //after jdk1.5 Autoboxing
		System.out.println(nPrm3);
		
		Integer i = new Integer(20);
		System.out.println(i.hashCode());
		int i1 = i.intValue();
		System.out.println(i.hashCode());
		
		
		/*
		 * primitive data type -> non-primitive data type
		 * 
		 * byte -> Byte
		 * short -> Short
		 * char -> Character
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 */
	}


}
