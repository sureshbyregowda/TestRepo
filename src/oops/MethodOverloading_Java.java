package oops;

public class MethodOverloading_Java {
	
	  public static void main(String[] args) 
	  {	  
		  MethodOverloading_Java obj = new MethodOverloading_Java(); 
		  obj.sum(10, 10, 10); 
		  obj.sum(20, 20); 	  
	  }
	  
	  public void sum(int a, int b) 
	  { 
		  System.out.println(a + b); 
	  }
	  
	  public void sum(int a, int b, int c) 
	  { 
		  System.out.println(a + b + c);
	  }
	 
}

//**************************************//

class Adder{  
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
}  

class TestOverloading1{  
	 public static void main(String[] args)
	 {  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	 }
}  
