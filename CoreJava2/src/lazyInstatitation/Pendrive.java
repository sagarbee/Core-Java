package lazyInstatitation;

public class Pendrive {

	String brand;
	int capacity;
	double price;

	public Pendrive() {

	}

	public Pendrive(String brand, int capacity, double price) {

		super();
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
		
	}
	
	public void showPendrive()
	{
		System.out.println("Pendrive..............");
		System.out.println("Brand Name: "+brand);
		System.out.println("Capacity: "+capacity);
		System.out.println("Price: "+price);
	}
	
	
}
