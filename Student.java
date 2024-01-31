package day5;

public class Student {
	
	String sname;
	int sid;
	char grade;
	
	
	Student(int id, String name, char g)
	{
		sname = name;
		sid = id;
		grade = g;
	}
	
	void getValues(int id, String name, char g) //method
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
		
	}

}
