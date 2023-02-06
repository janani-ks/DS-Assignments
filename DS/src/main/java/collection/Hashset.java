package collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
public class Hashset {
	public static void main(String[] args){  
		    HashSet<String> set=new HashSet<String>();  
		    Logger l1 = Logger.getLogger("com.api.jar");
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");
		           set.add("Five");
		           l1.info("Hashset also doesn't allow dublicates and It will print values in random order.");
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		        	   l1.log(Level.INFO,()->i.next());  
		           }  
		           l1.log(Level.INFO,()-> "Size of Hashset = " +set.size());
		           set.remove("Five");
		           l1.info("After removing Five updated Hashset!!!");
		           Iterator<String> i1=set.iterator();
		           while(i1.hasNext())  
		           {  
		        	   l1.log(Level.INFO,()->i1.next());  
		           }  
		 }  
}
