package oops;

public class UseStatic {

	static int a = 3;
	static int b;
	
	static void meth(int x)
	{
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(24);
	}
	
	static {
		System.out.println("Static block initialized");
		b= a*7;
	}

}
