package TestAutomation;

public class TestClass {
	
	static int v;

	TestClass() {
		
		System.out.println("This is constructor");
	}

	{
		System.out.println("non-static block is invoked");
	}
	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {

		System.out.println("Hello main");
		TestClass a = new TestClass();
		TestClass a1 = new TestClass();
	}

}
