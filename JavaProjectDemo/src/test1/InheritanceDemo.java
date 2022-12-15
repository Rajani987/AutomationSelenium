package test1;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp= new Employee(); 
		Employee employee= new Employee(101, "Ahmed", 20);
		employee.show();
		Person person = new Person(25, "ABC");
		person.show();
	}

}
