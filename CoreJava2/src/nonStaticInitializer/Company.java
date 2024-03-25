package nonStaticInitializer;

public class Company {
	String companyName = "ABC";
	String empName;
	String empRole;
	double salary;				

	public void showDetails()
	{
		System.out.println(companyName);
		System.out.println(empName);
		System.out.println(empRole);
		System.out.println(salary);

	}
	
}


