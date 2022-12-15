package oops;

 class Student {

	 final String name; 
	 int rollNo;
	final int fees =100;
	 Student() // default constructor
	{
	name ="Test";
	rollNo = 10;
	
	}
	
	Student(int rollNo, String name) // para
	{
	this.rollNo = rollNo;
	this.name = name; 
	}
	protected void show()
	{
		System.out.println("Name = " + name);
		System.out.println("rollNo = "+ rollNo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(); // 
		s1.show();
		Student s2 = new Student(11,"Lekha");
		s2.show();
		Student s3 = new Student(12, "Radhika");
		s3.show();
	}

}
