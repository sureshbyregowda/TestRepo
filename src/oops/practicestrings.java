package oops;

public class practicestrings {

	public static void main(String[] args) {
		
		String str = "Hello Bengaluru";		
		String str1 = "";		
		String str2 = "   123456   ";		
		String str3 = "   123456   abc";		
		String str4 = "Payment$100 paid";
		String str5 = "Payments $100 paid";		
		String str6 ="Payments $100 paid";		
		
		
		System.out.println(str4.charAt(7));   //index starts from 0
		
		System.out.println(str5.indexOf("$"));
		
		System.out.println(str.charAt(8));
		
		System.out.println(str6.substring(9));
		
		System.out.println(str.concat("  Garden City"));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		
		if(str.equalsIgnoreCase("Hello Bengaluru"))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		
		if(str1.isEmpty())
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("String is not empty");
		}
		
		System.out.println(str2.trim());
		
		if(str3.endsWith("abc"))
		{
			System.out.println("String ends with abc");
		}
		else
		{
			System.out.println("String not ends with abc");
		}
		
		System.out.println(str.chars());
		
		String[] arr = str.split(" ");
		
	    System.out.println(arr.length);
	        
	    for(int i=0;i<arr.length;i++)
	    {
	    	
	    	System.out.println(arr[i]);
	    }    
	    
	}

}
