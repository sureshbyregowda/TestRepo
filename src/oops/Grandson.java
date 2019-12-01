package oops;

public class Grandson extends son{      //inherit properties of Father in to son class

	public static void main(String[] args) {
		
		System.out.println("Inherit properties of Son and Father Class");
		
		Grandson s = new Grandson();	
        s.city();
        s.country();
		s.activities();  
	}

}
