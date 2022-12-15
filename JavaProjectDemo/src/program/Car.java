package program;

public class Car {

	// attributes
	int price ;
	String color;
	
	// methods
	void start()
	{
		System.out.println("Start a car");
	}
	
	void stop()
	{
		System.out.println("stop the car");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car();
		car1.color= "Black";
		car1.price= 100000;
		car1.start();
		car1.stop();
		
		car2.start();
		car2.stop();
	}

}
