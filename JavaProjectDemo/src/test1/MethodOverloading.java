package test1;

public class MethodOverloading {

	int a, a1; 
	
	static void display(int a)
	{
		System.out.println("Argument: " +a);
	}
	static void display(int a, int b)
	{
		System.out.println("argument: "+a +"and "+ b);
		
	}
	static void display(double a, int b)
	{
		System.out.println("argument: "+a +"and "+ b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(2.5, 3);
		display(1);

	}

}
