package multithreading;

public class SumProductThreadDriver {

	public static void main(String[] args) {
		
		SumOfDigitThread sum = new SumOfDigitThread();
		ProductOfDigitThread product = new ProductOfDigitThread();
		
		sum.start();
		product.start();
		
	}
	
}
