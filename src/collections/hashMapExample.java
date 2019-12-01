package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {

       HashMap<Integer,String> hm = new HashMap<Integer, String>();
       
       hm.put(2,"Suresh");
       hm.put(10, "Ramesh");
       hm.put(20, "Sneha");
       
       
//       System.out.println(hm.get(10));
//       hm.remove(10);
//       System.out.println(hm.get(10));
       
       Set sn = hm.entrySet();  //Converting to Set so that we can traverse      
       Iterator it = sn.iterator();       
       while(it.hasNext())
       {   
    	   //Converting to Map.Entry so that we can get key and value separately  
    	   Map.Entry mp = (Map.Entry)it.next();    	   
    	   System.out.println(mp.getKey());
    	   System.out.println(mp.getValue());
       }
       
	}

}
