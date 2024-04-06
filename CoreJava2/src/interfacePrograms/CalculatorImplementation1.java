package interfacePrograms;

public class CalculatorImplementation1 implements Calculator1,Calculator2{


	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		
		return a-b;
	}

	@Override
	public double division(int a, int b) {
		return a/b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public double modulus(int a, int b) {
		return a%b;
	}
	
	
}
