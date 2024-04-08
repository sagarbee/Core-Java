package superCallStatement;

public class ABCDriver {

	public static void main(String[] args) {
		
		C c = new C();
		c.displayC();
		
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);

	}
}
