package abstarctionPrograms;

public abstract class Mobile {

	private String brandName;
	private int storage;
	private int ram;
	private String chargingType;
	private String os;
	private double price;

	public String getChargingType() {
		return chargingType;
	}

	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Mobile() {

	}

	public Mobile(String brandName, int storage, int ram, String type, String os) {
		super();
		this.brandName = brandName;
		this.storage = storage;
		this.ram = ram;
		chargingType = type;
		this.os = os;
	}

	
	
	//  Abstract method
	public abstract void displaySmartphone();
	
	//Concrete not static method
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getStorage() {
		return this.storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getRam() {
		return this.ram;
	}

	public String getType() {
		return chargingType;
	}

	public void setType(String type) {
		this.chargingType = type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
