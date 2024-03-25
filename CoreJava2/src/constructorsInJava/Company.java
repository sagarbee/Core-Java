package constructorsInJava;

public class Company {

	String companyName = "XYZ";
	String empName;
	String qualification;
	double baseSalary;
	String role;
	String dateOfJoining;
	String status;
	
	
	public Company()
	{
		
	}
	
	public Company(String empName, String role) {
	
		this.empName = empName;
		this.role = role;
	}
	
	public Company(String empName,String role,String qualification,double baseSalary)
	{
		//Constructor chaining using this call statement
		this(empName,role);
		this.qualification = qualification;
		this.baseSalary = baseSalary;
	}
	
	public Company(String empName, String qualification, double baseSalary, String role,
			String dateOfJoining, String status) {

		this(empName,role,qualification,baseSalary);
		this.dateOfJoining = dateOfJoining;
		this.status = status;
	}
	
	public void showEmployeeDetails()
	{
		System.out.println(empName);
		System.out.println(qualification);
		System.out.println(baseSalary);
		System.out.println(role);
		System.out.println(dateOfJoining);
		System.out.println(status);


	}
	
}
