package multithreading;

public class SumProductThreadDriver {

	public static void main(String[] args) {
		
		SumOfDigitThread sum = new SumOfDigitThread();
		ProductOfDigitThread product = new ProductOfDigitThread();
		
		sum.setPriority(Thread.MIN_PRIORITY);
		product.setPriority(Thread.MAX_PRIORITY);
		
		sum.start();
		product.start();
		
	}
	
}
