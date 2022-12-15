package program;

public class StudentDemo {

	public static void main(String[] args) {
		
			Student s1 = new Student();
			s1.setName("Suman");
			s1.rollNo = 1;
			s1.branch="IT";
			
			
			
			System.out.println("---------Student s2 object details -----");
			Student s2 = new Student();
			s2.setName("Ashwini");
			s2.rollNo = 2;
			s2.branch="IT";
			s2.showDetails();
			System.out.println("---------Student s1 object details -----");
			
			Student s3 = new Student();
			s3.showDetails(3, "Suman", "IT");
			s3.showDetails();
			
		
	}

}
