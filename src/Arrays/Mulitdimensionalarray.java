package Arrays;

public class Mulitdimensionalarray {

	public static void main(String[] args) {

		int a[][] = new int[2][3];
		
		// a[row][column]                                    // 10 11 12
				                                             // 13 14 15
		a[0][0]= 10;
	    a[0][1]= 11;
	    a[0][2]= 12;
		a[1][0]= 13;
	    a[1][1]= 14;
	    a[1][2]= 15;	
	    
	    
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		
	    		System.out.println(a[i][j]);
	    	}
	   
	    }
	    
	    
	    int c[][]= { {20,21,22},{23,24,25},{26,27,28} };                                       // 20  21  22
	    																			           // 23  24  25	
	                                                                                           // 26  27  28
	    
	    for(int i=0;i<3;i++)
	    {	
	    	for(int j=0;j<3;j++)
	    	{
	    		
	    		System.out.println(c[i][j]);
	    	}
	   
	    }	    
	}    
}
