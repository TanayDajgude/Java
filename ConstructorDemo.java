package day5;

public class ConstructorDemo {
	
	ConstructorDemo()
	{
		System.out.println("This is a default constructor");
	}
	
	ConstructorDemo(int a, int b)
	{
		System.out.println("Parameterized Constructor :"+(a+b));
	}

	public static void main(String[] args) {
		
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo(50,20);
	}

}
