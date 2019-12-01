package Arrays;

public class Arrayexample {

	public static void main(String[] args) {

		int a[] = new int[10];   //Single dimensional array  - Delcares an array and allocates memory for the values
		
		a[0] = 1;   //Intialize values in to array
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;		
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;		
		a[9] = 10;		
		
		System.out.println("Length of array is "+ a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);  //Retrieve values from array
			
		}
		
		
		int b[] = {10,11,12,13,14,15};  // Memory allocated dynamically
		System.out.println("Length of array is "+ b.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);  //Retrieve values from array
			
		}	

	}

}
