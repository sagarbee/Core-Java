package Operators;

public class CompoundAssignmentOp1 {
	/*
	 * 1.CAO is a binary operator which is used assign value into a variable by updating 
	 *   the old value in the variable.
	 * 2.or we can say it perform operation specified by arithmetic operator and assign 
	 * 	 the result to the left operand.
	 * 3.CAO are: += , *= , -= , /= , %=
	 * 
	 */
	public static void main(String[] args) {
		
		long l1 = 456;
		l1 += 20;
		l1 -=10;
		l1 *= 20;
		System.out.println(l1);
	
	}
}
