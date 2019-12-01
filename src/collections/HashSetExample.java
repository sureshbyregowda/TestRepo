package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

			HashSet<String> hs = new HashSet<String>();			
			hs.add("Suresh");
			hs.add("Ramesh");
			hs.add("Swetha");	
			hs.add("Swetha");	
			hs.add("Sneha");			
			System.out.println(hs);	
			System.out.println(hs.size());		
			hs.remove("Sneha");
			System.out.println(hs);	
			System.out.println(hs.contains("Ramesh"));
			System.out.println(hs.isEmpty());
			
			//Traversing list through Iterator  
			Iterator<String> itr=hs.iterator(); 
			
			while(itr.hasNext()) //checks for next index or element present. if present return true else return false
			{  
				System.out.println(itr.next());  
			} 			
		}
}
