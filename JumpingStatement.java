package day3;

public class JumpingStatement {

	public static void main(String[] args) {
		
		//break statement
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------------");
		
		//continue statement
		for(int j=1;j<=10;j++)
		{
			if(j==7)
			{
				continue;
			}
			System.out.println(j);
		}

	}

}
