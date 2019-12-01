package Encapsulation;

public class Test {

	public static void main(String[] args) {
		//creating instance of the encapsulated class  
		Student s=new Student();  
		//setting value in the name member  
		s.setName("vijay");  
		//getting value of the name member  
		System.out.println(s.getName());  
		
		// s.setCollege("KITE"); //will render compile time error since setCollege method not found in Student class
		
		//System.out.println(s.college);  //Compile Time Error, because the college data member is private.  
       
	}

}
