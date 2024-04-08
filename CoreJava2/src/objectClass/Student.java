package objectClass;

public class Student {

	private String name;
	private int rollno;
	
	public Student()
	{
		
	}

	public Student(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}

	public String toString()
	{
		return "[Name: "+name+", Roll No: "+rollno+"]";
	}
	
	public boolean equals(Object student)
	{
		Student student2 = (Student) student;
		
		if(this == student2)
			return true;
		
		if(student2 == null || getClass() != student2.getClass())
			return false;
		
		return this.name == name && this.rollno == rollno;
	}
	
	public int hashCode()
	{
		int hc = 0;
		return this.name.hashCode()+rollno;
	}
}
