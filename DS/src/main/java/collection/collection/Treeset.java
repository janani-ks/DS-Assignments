package collection;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	public static void main(String[] args)   
    {   
        TreeSet<String> t = new TreeSet<String>(); 
        t.add("Java");   
        t.add("C");   
        t.add("Python");   
        t.add("Hibernate");   
        t.add("Python");
        Iterator<String> i=t.iterator();  
        while(i.hasNext()){  
        	display.println(i.next());  
        }    
        display.println("\nHere, TreeSet Does't allow dublicate values and It prints values in ascending order.");
        display.println("Size of Treeset = " +t.size());
        t.remove("C");
        display.println("\nAfter removing C value in TreeSet!!!" );
        Iterator<String> i1=t.iterator(); 
        while(i1.hasNext()){  
        	display.println(i1.next());  
           } 
    }   
}
