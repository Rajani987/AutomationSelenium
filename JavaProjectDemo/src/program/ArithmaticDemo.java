package program;

public class ArithmaticDemo {

	int a, b, c;
	double d1, d2;
	
	void sum(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Sum = "+sum);
		
	}
	int sum(int a, int b)
	{
		int s = a+b;
		System.out.println("Sum = "+s);
		return s;
	}
	
	double sum(double d1, double d2)
	{
		double sum = d1+d2;
		System.out.println("sum = "+ sum);
		return sum;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmaticDemo a = new ArithmaticDemo();
		a.sum(10, 20); // 30
		a.sum(10, 20, 30); // 60
		a.sum(10.25, 20.75);
		a.a=10;
		a.b=20;
		a.sum();
		
	}

}
