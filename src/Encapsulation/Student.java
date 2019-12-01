package Encapsulation;

public class Student
{  
	//private data member  
	private String name;  
	
	//getter method for name  
	public String getName()
	{  	
		return name;  
	}  
	
	//setter method for name  
	public void setName(String name)
	{  
	  this.name=name;  // this.name - is a local variable
	}  
	
	private String college="AKG";  
	//getter method for college  
	public String getCollege()
	{  
		return college;  
	}  
	
}  

