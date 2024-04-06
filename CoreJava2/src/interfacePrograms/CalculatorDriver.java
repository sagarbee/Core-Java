package interfacePrograms;

public class CalculatorDriver extends CalculatorImplementation1{

	public static void main(String[] args) {

		CalculatorImplementation1 ci1 = new CalculatorImplementation1();
		
		// IF class is implementing two interface with same method then-> 
		// It will execute last interface method by default i.e ...implements Calculator1,Calculator2{} --> In this case Calculator2
		System.out.println(ci1.addition(20,40));
		//if we want to execute specific interface method then
//		System.out.println(ci1.super.addition(12,34));
//		System.out.println(Calculator1.addition(34, 89));
		System.out.println(ci1.subtraction(34, 89));
	}

}
