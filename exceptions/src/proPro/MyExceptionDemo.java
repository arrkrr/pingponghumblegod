package proPro;
//see the path, change the number to 5/0 to create an ae
public class MyExceptionDemo {
	public static void main(String[]args) {
		MyExceptionDemo med = new MyExceptionDemo();
		try {

		}catch(ArithmeticException ae) {
			
		}
		med.m1();
		System.out.println("Finished main");
	}
	void m1() {
		System.out.println("Executing m1");
		System.out.println("Calling m2");
		m2();
		System.out.println("Finished m1");
	}
	void m2() {
		System.out.println("Executing m2");
		System.out.println("Calling m3");
		System.out.println(5/1);
		m3();
		System.out.println("Finished m2");
	}
	void m3() {
		System.out.println("Executing m3");
		try{
			throw new Exception();
		}catch(Exception e) {
			
		}
		System.out.println("Finished m3");
	}
}
