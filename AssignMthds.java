package day5;

public class AssignMthds {
	
	// Create a class students which contain variables and methods
	
	int sID,sub1,sub2,sub3;
	String sname;
	
	void getStuData(int id,String name)
	{
		sID = id;
		sname = name;
	}
	
	void getStuMarks(int m1, int m2, int m3)
	{
		sub1 = m1;
		sub2 = m2;
		sub3 = m3;
	}
	
	void totalMarks()
	{
		System.out.println("ID:"+sID+" Name:"+sname+" Sub1:"+sub1+" Sub2:"+sub2+" Sub3:"+sub3+" Total Marks:"+(sub1+sub2+sub3));
	}
	
	
	

	public static void main(String[] args) {
		
		AssignMthds as1 = new AssignMthds();
		as1.getStuData(101,"John");
		as1.getStuMarks(200,300,400);
		as1.totalMarks();

	}

}
