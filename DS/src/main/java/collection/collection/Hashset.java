package collection;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	public static void main(String[] args){  
		    HashSet<String> set=new HashSet<String>();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");
		           set.add("Five");
		           display.println("Hashset also doesn't allow dublicates and It will print values in random order.");
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		        	   display.println(i.next());  
		           }  
		           display.println("Size of Hashset = " +set.size());
		           set.remove("Five");
		           display.println("After removing Five, Updated Hashset!!!");
		           Iterator<String> i1=set.iterator();
		           while(i1.hasNext())  
		           {  
		        	   display.println(i1.next());  
		           }  
		 }  
}
