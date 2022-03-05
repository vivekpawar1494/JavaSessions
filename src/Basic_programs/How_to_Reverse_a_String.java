package Basic_programs;

public class How_to_Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String in java is immutable which means we cannot alter the string
		 * 
		 */
		String name = "selenium";
		System.out.println("Original string is " + name);

		// taking a string var to store the reversed string
		String reversed_string = "";
		int length_of_string = name.length();
		System.out.println(length_of_string);

		/* using for loop and charAt() method:
		 * 
		 * 1. taking length of string -1 as index is start from 0 loop will be executed
		 * 2. until is greater than or equal to 0 to print all the characters from last
		 * 3. index to first index i-- will reduce or decrease the index from last to first
		 * 4. index with the iterations will store each character in a string then will
		 * 5. print entire string outside the loop
		 * 
		 */
		for (int i = length_of_string - 1; i >= 0; i--) {
			reversed_string = reversed_string + name.charAt(i);
		}

		System.out.println("Reversed string is " + reversed_string);

		// using string buffer
		/*
		 * String buffer is mutable create a object of string buffer class and will pass
		 * the string to get reverse
		 */
		StringBuffer sf = new StringBuffer(name);
		System.out.println("Reversed string is " + sf.reverse());

		
		/*
		 * Questions:
		 * How to reverse a string?
		 * diff b/w string and string buffer?
		 * do we have reverse function in string?
		 */
		
	}

}
