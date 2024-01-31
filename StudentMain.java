package day5;

public class StudentMain {

	public static void main(String[] args) 
	{
		// 3) Assign values by using constructor
		Student s1 = new Student(102,"Aryan",'C');
		
		//1) Assign values by using reference variables 
		
		/*s1.sname = "David";
		s1.sid = 101;
		s1.grade = 'B';*/
		
		//2) Assign values by using method
		//s1.getValues(105,"Peter",'B');
		
		s1.display();

	}

}
