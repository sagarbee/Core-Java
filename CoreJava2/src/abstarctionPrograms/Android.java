package abstarctionPrograms;

public class Android extends Mobile{

	private String androidVersion;
	private final String os = "Android";
	public Android()
	{
		
	}
	
	public Android(String brandName,int ram,int storage,String type,String androidVersion)
	{
		super(brandName,ram,storage,type,"Android");
		this.androidVersion = androidVersion;
		
	}
	@Override
	public void displaySmartphone() {
		// TODO Auto-generated method stub
		System.out.println("Your Phone   ");
		System.out.println("---------------------------");
		System.out.println("Brand: "+getBrandName());
		System.out.println("RAM: "+getRam()+"GB");
		System.out.println("Storage: "+getStorage()+"GB");
		System.out.println("Charging Type: "+getChargingType());
		System.out.println("Operating System: "+os);
		System.out.println("Android Version: "+this.androidVersion);
		System.out.println("--------------------------");
	}

	
}
