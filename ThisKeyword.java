package day6;

public class ThisKeyword {
	
	int a,b;  //instance or class variables
	
	void getvalues(int a, int b) // method variables or external variables
	{
		
		/*
		 a = a
		 b = b
		 The compiler will get confused which is class variable and method variable so we use this keyword
		 */
		// so we use this keyword to refer 
		this.a = a;
		this.b = b;
		
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.getvalues(30,40);
		th.printvalues();

	}

}
