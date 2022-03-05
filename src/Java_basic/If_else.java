package Java_basic;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating scanner class object to take input
		Scanner sc = new Scanner(System.in);
		
		//asking for user's age
		System.out.println("Please enter your age:");
		Integer user_age = null;
		try {
			user_age=sc.nextInt();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("There is an exception " + e.getLocalizedMessage() + " Please try again and enter your age correctly.");
		}
		
		//asking for user's firs tname
		System.out.println("Please enter your name:");
		String user_name = null;
		try {
			user_name = sc.next();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("There is an exception " + e + "Please try again and enter your name correctly.");
		}
		
		
		//condition for the club
//		caanot enter below of age 13
//		can enter but can not drink berween 13 and 7
//		can enter and can have drink above or equal to 18
		
//		caanot enter below of age 13
		if (user_age <= 12) {
			System.out.println(user_name + " you cannot enter to the club because your age is " + user_age);
		}

//		can enter but can not drink berween 13 and 7
		else if (user_age < 18 && user_age > 12) {
			System.out.println(user_name + " you can enter to the club but your age is " + user_age + " so you would not be allowed to drink..");
		}
		
//		can enter and can have drink above or equal to 18
		else if (user_age >= 18) {
			System.out.println(user_name + " you can enter to the club as your age is " + user_age + " so you are allowed to drink");
		}
		
	}

}
