package test1;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =100;
		int div=0;
		try {
		
			div =100/10;  
		
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer exception");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("This is just a ArithmeticException");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println(div);
		System.out.println(a);
	}

}
