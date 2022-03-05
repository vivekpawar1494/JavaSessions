package Java_basic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Java arithmatic operators are used to perform addition, subtraction, multiplication, and division.


		
		int a=10;  
		int b=5;  
		System.out.println((double)a+(double)b);//15  output will be in double via type casting
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		
		System.out.println(a++);
		//10 //value of a will be increase in next statement so it will be 11 in next statement but there is no statement so after ++a it would be 12
		
		System.out.println(++a);//12 //value will be increased in current statement

		System.out.println(a--);//12
		System.out.println(--a);//10

	}

}
