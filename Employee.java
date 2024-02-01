package day5;

public class Employee {
	
	String ename;
	int deptno;
	String post;
	double salary;
	
	void display()
	{
		System.out.println(ename);
		System.out.println(deptno);
		System.out.println(post);
		System.out.println(salary);
		
	}
	
	public static void main(String arg[])
	{
		Employee emp1 = new Employee();
		emp1.ename = "John";
		emp1.deptno = 101;
		emp1.post = "Manager";
		emp1.salary = 8000.548;
		
		emp1.display();
	}

}
