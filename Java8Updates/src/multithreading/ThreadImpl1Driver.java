package multithreading;

public class ThreadImpl1Driver {

	public static void main(String[] args) {
	
		Thread1 t1 = new Thread1();
		Thread1 t3 = new Thread1();
		
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
