package derivedTypecasting;

public class Cardiologist extends Doctor{

	String specialization;
	String organ; 
	
	public Cardiologist() {

		
	}
	
	public Cardiologist(String hospital,String name,String degree,double fees,String specialization, String organ) {
		super(hospital,name,degree,fees);
		this.specialization = specialization;
		this.organ = organ;
	}
	
	public Cardiologist(String hospital,String name,String degree,double fees) {
		super(hospital,name,degree,fees);
	}
	
	public void showCardiologist()
	{
		System.out.println("Cardiologist ");
		System.out.println("---------------------------");
		System.out.println("Hospital: "+hospital);
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Fees: "+fees+" + addtional charges: "+2000+" = "+(fees+2000));
		System.out.println("Specialization: "+specialization);
		System.out.println("Organ: "+organ);
	}
	
	
}
