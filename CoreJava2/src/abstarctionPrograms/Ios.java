package abstarctionPrograms;

public class Ios extends Mobile{

	private String iosVersion;
	private final String os = "IOS";

	public Ios()
	{
		
	}

	public Ios(String brandName,int ram,int storage,String type,String iosVersion)
	{
		super(brandName,ram,storage,type,"IOS");
		this.iosVersion = iosVersion;
		
	}

	@Override
	public void displaySmartphone() {
		// TODO Auto-generated method stub
		System.out.println("Your Phone   ");
		System.out.println("---------------------------");
		System.out.println("Brand: " + getBrandName());
		System.out.println("RAM: " + getRam());
		System.out.println("Storage: " + getStorage());
		System.out.println("Charging Type: " + getChargingType());
		System.out.println("Operating System: " + os);
		System.out.println("IOS Version: " + iosVersion);
		System.out.println("--------------------------");
	}

}
