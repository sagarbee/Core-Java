package derivedTypecasting;

public class DocatorDriver {

	public static void main(String[] args) {

		// 1. As we have upcasted cardiologist to doctor we can only use member which
		// are in doctor
		Doctor doctor = new Cardiologist("Sanjivani", "Ravi shastri", "MBBS", 20000.00, "MD", "Heart");
		doctor.showDoctor();
		// doctor.showCardiologist(); -> CTE

		// 2. To use subclass members(i.e. Cardiologist) we need to downcast it to the
		// reference of to specific subclass

		Cardiologist doctorC = (Cardiologist) doctor; // -> Downcasted
		doctorC.showCardiologist();

		// Class Cast Exception

		/*
		 * Doctor doctor1 = new Doctor(); 
		 * Neurologist doctorN = (Neurologist) doctor1;
		 * doctor1.showDoctor();
		 * 
		 */

		// Even if don't upcasted it to doctor by giving cardiologist reference of
		// doctor, Upcasting is done implicitly by compiler
		Cardiologist doctor2 = new Cardiologist("Sanjivani", "Vina Bharati", "MBBS", 20000.00, "MD", "Heart");
		doctor2.showCardiologist();
		doctor2.showDoctor();

		Neurologist doctor3 = new Neurologist("YCM Hospital", "Suresh bhati", "MBBS", 7500, "MD", "Brain");
		doctor3.showDoctor();
		doctor3.showNeurologist();

		/*Null Pointer Exception
		 * Doctor doctor4 = null; 
		 * doctor4.showDoctor();
		 */

	}

}
