package objectClass;

public class Student2 {
	private String name;
	private int rollno;

	public Student2()
	{
		
	}

	public Student2(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return "[Name: " + name + ", Roll No: " + rollno + "]";
	}

}
