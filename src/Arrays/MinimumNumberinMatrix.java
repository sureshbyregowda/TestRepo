package Arrays;

public class MinimumNumberinMatrix {

	public static void main(String[] args) {
		
		//  10  11  12 
        //  21  0   23 
		//  31  32  33
		
		//Step1:  Find minimum number
		//Step2:  Identify the column of the minimum number
		//Step3:  Find the maximum in identified column
		//print maximum number in the matrix for the least number found.
		
		int a[][] = { {10,11,12},{21,0,23},{31,32,33} };
		
		int min = a[0][0];
		int mincolumn = 0;
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				
				//System.out.println(a[i][j]);
				
				if(a[i][j]<min)
				{
					
					min = a[i][j];
					mincolumn = j;
					
				}
			}
		}
		
		System.out.println("least number in the matrix  "+min);
		System.out.println("Column number for the least number  "+mincolumn);
		
		int max = a[0][mincolumn];
		int k=0;
		
		while(k<3)
		{
			
			if(a[k][mincolumn]>max)
			{
				
				max = a[k][mincolumn];
			}
			k++;
		}
		
		System.out.println(max);
	}

}
