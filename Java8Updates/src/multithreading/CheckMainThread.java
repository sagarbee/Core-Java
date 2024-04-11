package multithreading;

public class CheckMainThread extends Thread {

	public static void main(String[] args) {
		
		Thread main = new Thread();
		System.out.println(main.getId());
		System.out.println(main.getName());
		System.out.println(main.getPriority());
		System.out.println(main.getClass());
		
		
		Thread1 t1 = new Thread1();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getClass());
	}
	
}
