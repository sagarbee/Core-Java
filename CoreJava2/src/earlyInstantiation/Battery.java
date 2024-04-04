package earlyInstantiation;

public class Battery {

	String brand;
	int capacity;
	double price;
	String type;

	public Battery() {
		super();
	}

	public Battery(String brand, int capacity, double price, String type) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
		this.type = type;
	}
	
	public void showBattery()
	{
		System.out.println("Brand Name: "+brand);
		System.out.println("Battery Type: "+type);
		System.out.println("Capacity: "+capacity);
		System.out.println("Price: "+price);
	}
}
