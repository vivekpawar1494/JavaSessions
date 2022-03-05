package Java_basic;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		
		
		int b[]={33,3,4,5};//declaration, instantiation and initialization  
		
		//iterating array
		
		for(int i=0;i<a.length;i++){//length is the property of array  
			System.out.println(a[i]);  
			}
		
//		for(int i=0;i<=a.length;i++){//length is the property of array  
//			System.out.println(a[i]);  
//			}
		//will give u array index out of bound array
		
		for(int i=0;i<b.length;i++){//length is the property of array  
			System.out.println(b[i]);  
			}
		
		
		//2d array
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");   //print will print the output in same line n cursor would not move to nect line
		 }  
		 System.out.println();  
		} 
		
	}

}
