package Basic_programs;

public class How_to_Reverse_an_Integer {

	public static void main(String[] args) {
// reverse an integer
		long num = 12345; // rxpected = 54321
		long reverse_num = 0;

		/*
		 * if num!=0 then while loop will iterate till it become 0 reverse will have the
		 * reverse x10 + num%10 ex = first iteration = reverse(0)x10 + num(12345)%10 =>
		 * 0 + 5 num(12345/10)=> 1234
		 * 
		 * second iteration = reverse(5)x10 + num(1234)%10 = 50 +4 => 54 num(1234)/10 =
		 * 123
		 */
		while (num != 0) {
			reverse_num = reverse_num * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of integer 12345 is " + reverse_num);

	}

}
