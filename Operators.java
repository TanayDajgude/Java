package day2;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("-----------------  Arithmetic Operators : + - * / %  -----------------");
		
		int a = 10;
		int b = 20;
		System.out.println("Addition of a and b :"+(a+b));
		System.out.println("Difference of a and b :"+(a-b));
		System.out.println("Multiplication of a and b :"+(a*b));
		System.out.println("Division of a and b :"+(a/b));
		System.out.println("Mod Division of a and b :"+(a%b));
		
		System.out.println("----------------- Relational Operators or Comparison Operators : == < > <= >= != ------------------");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("------------------ Logical Operators -->> && || !  -------------------------");
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!y);
		System.out.println(!x);
		
		System.out.println("---------------- increment/decrement operators --> -- ++  -----------------------");
		a = 10;
		a++;
		System.out.println(a);
		
		b = 10;
		b--;
		System.out.println(b);

	}

}
