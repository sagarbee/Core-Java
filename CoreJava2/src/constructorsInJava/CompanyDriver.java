package constructorsInJava;

public class CompanyDriver {

	public static void main(String[] args) {
		
		Company emp1 = new Company();
		System.out.println(emp1); // reference of an Object emp1
		
		System.out.println(emp1.empName+" "+emp1.qualification);
		
		emp1.empName = "Sagar";
		emp1.qualification = "BE";
		
		System.out.println(emp1.empName+" "+emp1.qualification);
		
		Company emp2 = new Company("Rakesh","Software Developer");
		System.out.println(emp2.empName+" "+emp2.role);
		
		Company emp3 = new Company("Akash","Devops Developer","BE",35000.00);
		
//		System.out.println(emp3.empName);
//		System.out.println(emp3.baseSalary);
//		System.out.println(emp3.qualification);
//		System.out.println(emp3.role);
//		
		emp3.showEmployeeDetails();
		
	}
	
}
