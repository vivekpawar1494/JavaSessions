package Java_basic;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating scanner class object to take input
		Scanner sc = new Scanner(System.in);
		
		//asking for user's grade
		System.out.println("Please enter your grade:");
		String user_grade = null;
		try {
			user_grade=sc.next();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Please try again and enter your grade correctly.");
		}
		
		switch (user_grade) {
		case "A":
			System.out.println("Your percentage is above 90.");
			break;
		
		case "B":
			System.out.println("Your percentage is above 90.");
			break;
		}
				

	}

}
