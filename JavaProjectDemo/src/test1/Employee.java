package test1;

public class Employee extends Person {

	int id;
	
	Employee()
	{
		this.id = 101;
	}
	Employee(int id, String name, int age)
	{
		super(age, name); //
		this.id=id;
	}
	
	// overriding 
	void show()
	{
		super.show();
		System.out.println("Id = " + id);
	}
	
}
