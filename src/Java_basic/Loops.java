package Java_basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Code of Java for loop  
	    for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    }  
	    
	    
	    int j=1;  
	    while(j<=10){  
	        System.out.println(j);  
	    j++;  
	    }  
	    
	    //using for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //breaking the loop  
	            break;  
	        }  
	        System.out.println(i);  
	    }  
	    
	    
	    //for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	    }  
	}

}
