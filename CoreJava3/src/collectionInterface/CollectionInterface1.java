package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface1 implements Comparable<CollectionInterface1>{

	String name;
	int age;
	long phone;
	double salary;
	
	public CollectionInterface1()
	{
		  
	}
	
	public CollectionInterface1(String name,int age, long phone,double salary){

		this.name = name;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
		
	}

	public int compareTo(CollectionInterface1 o) {
		
		if(this.salary > o.salary)
		{
			return 1;
		}
		else if(this.salary<o.salary)
		{
			return -1;
		}
		
		return 0;
	}
	
	public String toString()
	{
		return "[Name: "+name+", Age: "+age+", Phone: "+phone+", Salary: "+salary+"]";
	}
	
	public boolean equals(Object o)
	{
		CollectionInterface1 ci = (CollectionInterface1)o;
		return this.salary == ci.salary;
	}

	public int hashCode()
	{
		return (int)salary;
	}
}
