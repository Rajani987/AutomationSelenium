package test1;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a=10;
		String str = null;
		str.length(); // checked 
		int arr[]= {10,20,30}; 
		System.out.println(arr[5]); // unchecked 
		try 
		{
		System.out.println(arr[5]);
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(arr[1]);
		
		System.out.println(arr[2]);
		
		System.out.println(arr[0]);
		
					
	}

}
