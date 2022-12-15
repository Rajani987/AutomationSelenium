package test1;

public class TestThrow {

	public static void validate(int age) throws UserDefinedException
	{
	if(age<18)
	{
		throw new UserDefinedException("Person is not eligible to apply");
	}
	else
	{
		System.out.println("Person is eligible to apply");
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		try {
			validate(12);
			
		} 
		catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			System.out.println("User defined exception");
			System.out.println(e);
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" many lines code ");
		
	}

}
