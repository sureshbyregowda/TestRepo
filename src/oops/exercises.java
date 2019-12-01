package oops;

public class exercises {

	public static void main(String[] args) {
		
		
		int sum=0;
		
		int c[] = {2,3,5,6,7};
		
		for(int i=0;i<c.length;i++) 
		{
			sum=sum+c[i];
			
			System.out.println(c[i]);
			
			if(c[i]==6)
			{
				System.out.println("Index of Value 6 is  "+i);
				break;
			}
		}
		
	//	System.out.println("sum of array numbers "+sum);
	}

}
