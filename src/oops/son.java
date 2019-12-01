package oops;

public class son extends Father{      //inherit properties of Father in to son class

	public static void main(String[] args) {

		
		System.out.println("Inherit properties of Father Class");
		son s = new son();	
		s.city();
		s.country();
        
	}
	
	public void activities()
	{
		
		System.out.println("Activities method");
	}

}
