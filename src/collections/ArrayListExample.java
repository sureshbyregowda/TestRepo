package collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();		
		a.add("Suresh");
		a.add("Ramesh");
		a.add("Swetha");	
		a.add("Swetha");	
		a.add(0,"Sneha");	
		
		System.out.println(a);
		System.out.println(a.get(1));		
		System.out.println(a.size());		
		a.remove(0);
		System.out.println(a);
		
		System.out.println(a.indexOf("Swetha"));		
		System.out.println(a.contains("Ramesh"));
		System.out.println(a.isEmpty());
		
	}
}
