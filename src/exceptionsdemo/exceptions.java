package exceptionsdemo;

public class exceptions {
	
	
	int a =7;
	int b =0;
	
	int k=a/b;           //Getting java.lang.ArithmeticException: /by zero
	
	public void getdata()
	{
		System.out.println(k);
	}

	public static void main(String[] args) {

		exceptions ex = new exceptions();
		
		ex.getdata();

	}

}

class exceptionstrycatch {

	public static void main(String[] args) {

		int a =7;
		int b =0;		
		try
		{
			//int k=a/b;  			
			//System.out.println(k);			
			int arr[] = new int[5];			
			System.out.println(arr[6]);			
		}
		catch(ArithmeticException et)
		{
			System.out.println("Arthmetic error found  "+et);
		}
		catch(IndexOutOfBoundsException ob)
		{
			System.out.println("Index out of bound error found  "+ob);
		}		
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{			
			System.out.println("Delete Coookies");			
		//	System.out.println("Close browser");
		}
	}
}