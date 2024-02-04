package day5;

public class Calculation {
	
	
	int x = 20;
	int y = 30;
	
	/*void sum() // Case1 : not taking parameters and also not return any value
	{
		System.out.println(x+y);
	}*/
	
	
	
	/*int sum()   // Case2 : not taking parameters but returning value
	{
		return(x+y);
	}*/
	

	
	/*void sum(int a, int b)  // Case3: taking parameters, but not returning any value
	{
		System.out.println(a+b);
	}*/
	
	
	int sum(int g, int f)  // Case4: method is taking parameters and also returning a value
	{
		return(g+f);
	}
	
	

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum(); // Case 1
		
		/*int res = cal.sum(); // Case 2
		System.out.println(res);*/
		
		//cal.sum(20,40); // Case 3
		
		System.out.println(cal.sum(50,50));
		
	}

}
