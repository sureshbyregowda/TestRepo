package Abstraction;

	public class TestAbstraction1 {
	
		public static void main(String[] args) {
	
			Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
			s.draw(); 		
	
		}
	}
	
	abstract class Shape
	{		
		abstract void draw(); 		
	}  
	
	//In real scenario, implementation is provided by others i.e. unknown by end user  
	class Rectangle extends Shape
	{  
	   void draw()
	   {
		   System.out.println("drawing rectangle");
	   }  
	}  
	
	class Circle1 extends Shape
	{  
	  void draw()
	  {
		  System.out.println("drawing circle");
	  }  
	}  	

	//****************************Example2*****************************8
	
	abstract class Bank
	{ 		
		abstract int getRateOfInterest(); 		
	}    
	
	class SBI extends Bank
	{    
	  int getRateOfInterest()
	  {
		  return 7;
	  }    
	}    
	
	class PNB extends Bank
	{  		
	  int getRateOfInterest()
	  {
		  return 8;
	  }    
	}    
		    
	class TestBank
	{    
		public static void main(String args[])
		{    
			//Bank b;  
		  Bank	b=new SBI();  
		  System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
			
		  Bank	b1=new PNB();  
		  System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");    
		}
    }    	

