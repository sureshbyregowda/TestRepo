package Arrays;

public class Reversestring {

	public static void main(String[] args) {

       String s = "madam";
       
       String str ="";
       
       System.out.println("String length  "+" "+s.length());
       
       for(int i=s.length()-1;i>=0;i--)
       {
    	   
    	 //  System.out.println(s.charAt(i));
    	   
    	   str = str+s.charAt(i);
       }
       
       System.out.println("Reversed String is  "+str);
       
       boolean value = s.contentEquals(str);
       
  //    char[] a = s.toCharArray();
       
       if(value)
       {
    	   
    	   System.out.println("String is Palindrome");
       }
       else
       {
    	   System.out.println("String is not Palindrome");
       }

	}

}
