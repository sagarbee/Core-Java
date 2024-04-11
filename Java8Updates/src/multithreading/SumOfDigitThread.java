package multithreading;

public class SumOfDigitThread extends Thread{

	public void run()
	{
		int num = 123;
		int sum=0;
		while(num!=0)
		{
			sum+=num;
			num/=10;
		}
		System.out.println("Sum of Digits: "+sum);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
