package multithreading;

public class Thread2 extends Thread{

	public void run()
	{
		for(char i='A';i<'F';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
