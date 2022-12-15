package abs;

public class Cat implements Animal, Home {

	@Override
	public void eat() {
		System.out.println("Eat method");
		
	}
	@Override
	public void stay() {
		System.out.println("Stay Method");
	}
	public void sleep() {
		System.out.println("Sleep Method");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
