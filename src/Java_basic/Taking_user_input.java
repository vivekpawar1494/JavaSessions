package Java_basic;

import java.util.Scanner;

public class Taking_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//asking for users age
		System.out.println("Please enter your age:");
		int user_age = sc.nextInt();
		
		//name
		System.out.println("Please enter your name");
		String user_name = sc.next();
		
		//printing
		System.out.println("user's age is " + user_age);
		System.out.println("user's name is " + user_name);


	}

}
