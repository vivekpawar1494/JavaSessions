package Oops_basic;

//If a class has multiple methods having same name but different in parameters, 
//it is known as Method Overloading.
//By changing number of arguments
//By changing the data type



public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fro class Adder1
		System.out.println(Adder1.add(11,11));  
		System.out.println(Adder1.add(11,11,11));  

		
		//for class Adder2
		System.out.println(Adder2.add(11,11));  
		System.out.println(Adder2.add(12.3,12.6));  
	}

}


///By changing number of arguments
class Adder1{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  


//By changing the data type
class Adder2{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  