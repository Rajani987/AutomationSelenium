package oops;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog d1 = new Dog();
		
		d1.eat();
		d1.bark();
		
		// animal class object
		Animal a = new Animal();
		a.eat();
		
		Cat c1 = new Cat();
		c1.eat(); // eating
		c1.meow(); // meowing
		
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();
	}

}
