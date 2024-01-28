package day3;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		System.out.println("------------------Print numbers from 1 to 10-------------------");
		while(i<=10)
		{
			System.out.println(i);
			i = i+1;
		}
		
		System.out.println("------------------Print even numbers from 1 to 10-------------------");
		
		while(j<=10)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}
			j++;
		}

	}

}
