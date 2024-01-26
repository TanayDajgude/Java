package day3;

import java.util.*;

public class Assignments {

	public static void main(String[] args) {
		
		System.out.println("1) WAP in java to display the multiplication table of 5");
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 X "+i+" = "+(i*5));
		}
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("2) WAP to find greatest of 3 numbers");
		
		int a = 7;
		int b = 17;
		int c = 30;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater then "+b+" and "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater then "+a+" and "+c);
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is greater then "+a+" and "+b);
		}
		else
		{
			System.out.println("all are equal");
		}
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("3) WAP to get input from user ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sometihng :");
		String userInput = sc.nextLine();
		System.out.println("You Entered :"+userInput);
		
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("4) WAP to find number is positive or negative");
		
		int g = 10;
		if(g<0)
		{
			System.out.println("Number is negative");
			
		}
		else
		{
			System.out.println("Number is positive");
		}
		
		
		
		
	}

}
