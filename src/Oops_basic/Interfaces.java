package Oops_basic;

public class Interfaces implements Car1, Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("My car is starting");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human is walking");
	}
}


/*
 * There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.

In other words, Interface fields are public, static and final by default, and 
the methods are public and abstract.


 */

interface Car1{
	void start();
	
}

interface Human{
	void walk();
}
