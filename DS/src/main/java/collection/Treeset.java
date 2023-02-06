package collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;

import java.util.TreeSet;
public class Treeset {
	public static void main(String[] args)   
    {   
        TreeSet<String> t = new TreeSet<String>(); 
        Logger l1 = Logger.getLogger("com.api.jar");
        t.add("Java");   
        t.add("C");   
        t.add("Python");   
        t.add("Hibernate");   
        t.add("Python");
        Iterator<String> i=t.iterator();  
        while(i.hasNext()){  
        	l1.log(Level.INFO,()-> i.next());  
        }    
        l1.info("Here, TreeSet Does't allow dublicate values and It prints values in ascending order.");
        l1.log(Level.INFO,()-> "Size of Treeset = " +t.size());
        t.remove("C");
        l1.info("After removing C value in TreeSet!!!" );
        Iterator<String> i1=t.iterator(); 
        while(i1.hasNext()){  
        	l1.log(Level.INFO,()-> i1.next());  
           } 
    }   
}
