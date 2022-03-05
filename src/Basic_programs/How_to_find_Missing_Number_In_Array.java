package Basic_programs;

public class How_to_find_Missing_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//taking an array from the number is missing
		int a[] = {1,2,3,5,6,7,8,9,10};
		
		
		//taking a sum var to hold the sum of the present elements of the array
		int sum_of_present = 0;
		
		//adding up all the present numbers in an array
		for(int i=0; i<a.length; i++) {
			sum_of_present = sum_of_present + a[i];
		}
		System.out.println("Sum of present elements- "+ sum_of_present);
		
		
		//addng up all the elements of original  array that is 1,2,3,4,5,6,7,8,9,0
		int sum_of_original_arrray=0;
		for(int j=1; j<=10; j++) {
			sum_of_original_arrray = sum_of_original_arrray + j;
		}
		System.out.println("Sum of original array- "+sum_of_original_arrray);
		
		System.out.println("Missing number is "+(sum_of_original_arrray-sum_of_present));
	}
	
		

}
