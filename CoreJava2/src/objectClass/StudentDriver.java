package objectClass;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student student1 = new Student("Sagar",1452);
		System.out.println(student1);
		student1.toString();
		
		System.out.println(student1.equals(student1));

		Student student2 = new Student("Sagar",1452);
		
//		System.out.println(student1==student2);
		
		System.out.println(student1.equals(student2));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
	}
}
