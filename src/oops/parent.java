package oops;

public class parent {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		methods m = new methods();		
        
        System.out.println("Sum of two numbers is "+ m.Sum());
        
        System.out.println("Multiplication of numbers is "+ m.Multiplication());
        
        System.out.println("Subtraction of 2 numbers is "+m.Subtraction(50, 40));
        
		// classobject.methodname

	}

}



