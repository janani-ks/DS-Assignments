package collection;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

public class Hashmap {
	 static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	 public static void main(String[] args){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>(); 
		   map.put(3,"Janani");  
		   map.put(1,"Nivedha");    
		   map.put(2,"Jaggu");   
		   map.put(4,"Shubha"); 
		   map.put(2,null);
		   display.println("Keys : " + map.keySet());
		   display.println("Values : " + map.values());
		   display.println( "Key/Value mappings: " + map.entrySet());
		   display.println("\nMap accepts the null value and if we give the dublicate key then it will updated to the corresponding key value."); 
		   map.remove(2);
		   display.println("\nAfter removing 2nd key and value Updated Hashmap!!!");
		   display.println("Key/Value mappings: " + map.entrySet());
		   display.println("Size of Hashmap = " +map.size());
		   display.println(map.get(5));
		   map.put(2, null);
		   map.replace(2,"Jaggu");
		   display.println("\nAfter updating 2 key value Updated Hashmap!!!");
		   display.println("Key/Value mappings: " + map.entrySet());
		   }  
		}  
