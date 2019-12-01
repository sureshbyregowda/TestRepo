
public class constructorexamples {
	
	
	public constructorexamples()
	{
		
		System.out.println("I'm inside constructor");
	}
	
	//Parametetized constructor
	public constructorexamples(int a, int b)
	{
		
		System.out.println("I'm inside parameterized constructor");
	}	
	
	
	public constructorexamples(String str)
	{
		
		System.out.println(str);
	}		
	

	public static void main(String[] args) {

		
		constructorexamples  con = new constructorexamples(); 	
		
		constructorexamples  con1 = new constructorexamples(10,20); 
		
		constructorexamples  con2 = new constructorexamples("Hello Bengaluru"); 

	}

}
