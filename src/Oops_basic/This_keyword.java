package Oops_basic;

public class This_keyword {
	
	
/*
 * Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
=>In the above example, parameters (formal arguments) and instance variables are same. 
	So, we are using this keyword to distinguish local variable and instance variable.
	
	
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  



this can be used to invoke current class method (implicitly)

class A{  
void m(){
System.out.println("hello m");
}
  
void n(){  
System.out.println("hello n");  
//m();  //same as this.m()  
this.m();  
}
}
  
class TestThis4{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}
}  



this() can be used to invoke current class constructor.	

class A{  
A(){
System.out.println("hello a");
}  

A(int x){  
this();  
System.out.println(x);  
}  
}  

class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
}
}  



Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.

 */

	
	

}
