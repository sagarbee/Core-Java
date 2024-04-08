package derivedTypecasting;

public class Doctor {

	String hospital;
	String name;
	String degree;
	double fees;
	
	public Doctor()
	{
		
	}
	
	public Doctor(String hospital,String name,String degree,double fees)
	{
		this.hospital = hospital;
		this.name = name;
		this.degree = degree;
		this.fees = fees;
	}

	
	public void showDoctor()
	{
		System.out.println("Doctor ");
		System.out.println("---------------------------");
		System.out.println("Hospital: "+hospital);
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Fees: "+fees);
	}
	
}
