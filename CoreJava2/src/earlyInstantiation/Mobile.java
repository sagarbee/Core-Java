package earlyInstantiation;

public class Mobile {

	String brand;
	int storage;
	int ram;
	double price;
	
	public Mobile()
	{
		
	}
	
	public Mobile(String brand, int storage,int ram,double price)
	{
		super();
		this.brand = brand;
		this.storage = storage;
		this.ram = ram;
		this.price = price;
	}
	
	Battery battery;
	
	{
		battery = new Battery("samsung",4500,1200.00,"Li-on");
	}
	
	
	public void showMobile()
	{
		System.out.println("Brand Name: "+brand);
		System.out.println("Mobile Storage: "+storage);
		System.out.println("RAM: "+ram);
		System.out.println("Price: "+price);
	}
}
