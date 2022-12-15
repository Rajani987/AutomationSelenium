package test1;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(isPrime(0))
		{
			System.out.println("number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
		
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n==0||n==1)
		{
			return true;
		}
		for(int i= 2;i< n  ; i++)
		{
			if(n%i ==0) // 5 - 2, 3, 4>5 - t 
			{
				return true;
			}
			
		}
		return false;
	
		

		
	}

}
