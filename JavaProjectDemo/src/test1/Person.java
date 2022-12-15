package test1;

public class Person {

	String name;
	int age;
	
	Person()
	{
		this.name= "test";
		this.age=1;
	}
	
	Person(int age, String name)
	{
		this.age= age;
		this.name= name;
	}
	void show()
	{
		System.out.println("Name = " +name);
		System.out.println("Age  = "+age);
	}
}
