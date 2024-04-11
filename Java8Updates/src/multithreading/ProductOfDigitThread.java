package multithreading;

public class ProductOfDigitThread extends Thread{

	public void run()
	{
		int num = 123;
		int product=1;
		while(num!=0)
		{
			product+=num;
			num/=10;
		}
		System.out.println("Product of Digits: "+product);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
