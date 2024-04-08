package derivedTypecasting;

public class Neurologist extends Doctor  {

	String specialization;
	String organ; 
	
	public Neurologist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Neurologist(String hospital,String name,String degree,double fees,String specialization, String organ) {
		super(hospital,name,degree,fees);
		this.specialization = specialization;
		this.organ = organ;
	}
	
	public void showNeurologist()
	{
		System.out.println("Neurologist ");
		System.out.println("---------------------------");
		System.out.println("Hospital: "+hospital);
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Fees: "+fees+" + addtional charges: "+4000+" = "+(fees+2000));
		System.out.println("Specialization: "+specialization);
		System.out.println("Organ: "+organ);
	}
	
}
