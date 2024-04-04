package lazyInstatitation;

public class Computer {

	String brand;
	String processor;
	int hd;
	int ram;
	double price;
	Pendrive pendrive;

	public Computer() {

	}
	
	public void insertPendrive(String brand,int capacity,double price)
	{
		pendrive = new Pendrive(brand,capacity,price);

		System.out.println("Pendrive Insertd ..");
	}

	public Computer(String brand, String processor, int hd, int ram, double price) {

		super();
		this.brand = brand;
		this.processor = processor;
		this.hd = hd;
		this.ram = ram;
		this.price = price;
	}
	
	public void showComputer()
	{
		System.out.println("Computer..............");
		System.out.println("Brand Name: "+brand);
		System.out.println("Processor: "+processor);
		System.out.println("Hard Disk Size: "+hd);
		System.out.println("RAM: "+ram);
//		System.out.println("Price: "+price);
	}
}
