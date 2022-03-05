package Java_basic;

import java.util.Scanner;

public class Methods {
	
	
	public void odd_even(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.println(number + " is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods number = new Methods();
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Please enter your number.");
		Integer num = null;
		
//		while (((Object)num).getClass() != int.class ) {
//			System.out.println("Please reenter your number.");
//			num = sc.nextInt();
//		}
		
		while (true) {
			System.out.println("Please enter your number.");
			num = sc.nextInt();
			
			if (((Object)num).getClass() != int.class ) {
				break;
			}
			
		}
		
		number.odd_even(num);

	}

}