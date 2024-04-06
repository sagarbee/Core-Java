package polymorphismPrograms;

public class CompileTimePolymorphism {

//	1.Constructor Overloading
	public CompileTimePolymorphism() {
		System.out.println("Default Constructor");
	}

	public CompileTimePolymorphism(String s1, String s2) {
		System.out.println("Inside Overloaded Constructor");
	}

//	2.Method Overloading
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
//	3.Operator Overloading
	
	public String add(String str1,String str2)
	{
		return str1+str2; //here + operator performs string concatenation unlike for integer where integer addition performs
	}

	public static void main(String[] args) {
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		CompileTimePolymorphism ctp2 = new CompileTimePolymorphism("s","s");
		
		// Here compiler decide which method to run at compiled time
		System.out.println(ctp.add(10, 23));
		System.out.println(ctp.add(10, 23, 89));
		System.out.println(ctp.add("Sagar ", "More."));
		
		Abc ob1 = new Xyz();
		
//		4.Variable Shadowing
		System.out.println(ob1.str1); //Although Object of Xyz is created it will be execute object of ref. used to invoke variable(i.e Abc) 
		System.out.println(ob1.str2);
		
		
//		5.Method Shadowing
		ob1.test("Hello"); //we can not oveload static only not static method can be overload.
		
		
	}
}
