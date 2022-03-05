package Oops_basic;

public class Abstractions {

	public static void main(String[] args) {
		
		Audi a1 = new Audi();
		a1.start();
		
		BMW b1 = new BMW();
		b1.start();
	}
}

abstract class Car{
	String brand;
	int price;
	
	abstract void start();
	
	//in abstract class we can create concrete fucntions
	void breaking() {
		System.out.println("Car is breaking");
	}
}

class Audi extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi starting");
	}
	
}

class BMW extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW starting");

	}
	
}
