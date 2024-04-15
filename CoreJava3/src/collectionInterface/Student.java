package collectionInterface;

public class Student {

	private String name;
	private int rollno;


	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String toString()
	{
		return "[Student Name: "+name+", Roll No: "+rollno+"]";
	}
	
	public int compareTo(Student o)
	{
		if(this.rollno > o.rollno)
		{
			return 1;
		}
		else if(this.rollno<o.rollno)
		{
			return -1;
		}
		
		return 0;
	}
	
}
