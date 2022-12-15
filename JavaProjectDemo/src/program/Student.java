package program;

public class Student 
{
	int rollNo;
	String name;
	String branch;
	
	Student()
	{
			System.out.println("This is Constructor");
	}
	
	void showDetails()
	{
		System.out.println("Roll no = " + rollNo);
		System.out.println("Name = " +name);
		System.out.println("Branch = "+branch);
	}
		//				(3, "Suman", "IT")
	void showDetails(int rollNo, String name, String branch)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}


}
