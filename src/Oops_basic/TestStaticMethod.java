package Oops_basic;


//The static keyword in Java is used for memory management mainly. 
//		We can apply static keyword with variables, methods, blocks and nested classes. 
//		The static keyword belongs to the class than an instance of the class.
//		Advantages of static variable
//		It makes your program memory efficient (i.e., it saves memory).

class Student{
    int rollno;
    String name;
    static String college = "ITS";
    
    static void change(){
    college = "BBDIT";
    }

    Student(int r, String n){
    rollno = r;
    name = n;
    }

    void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class TestStaticMethod{
   public static void main(String args[]){
   Student.change();//calling change method
   //creating objects
   Student s1 = new Student(111,"Karan");
   Student s2 = new Student(222,"Aryan");
   Student s3 = new Student(333,"Sonoo");
   //calling display method
   s1.display();
   s2.display();
   s3.display();
   }
}
