package collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hashmap {
	 public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>(); 
		   Logger l1 = Logger.getLogger("com.api.jar");
		   map.put(3,"Janani");  
		   map.put(1,"Nivedha");    
		   map.put(2,"Jaggu");   
		   map.put(4,"Shubha"); 
		   map.put(2,null);
		   l1.log(Level.INFO,()->"Keys : " + map.keySet());
		   l1.log(Level.INFO,()->"Values : " + map.values());
		   l1.log(Level.INFO,()-> "Key-Value mapping: " + map.entrySet());
		   l1.info("Map accepts the null value and if we give the dublicate key then it will updated to the corresponding key value."); 
		   map.remove(2);
		   l1.info("After removing 2nd key and value Updated Hashmap!!!");
		   l1.log(Level.INFO,()-> "Key-Value mappings: " + map.entrySet());
		   l1.log(Level.INFO,()->"Size of Hashmap = " +map.size());
		   l1.log(Level.INFO,()-> map.get(5));
		   map.put(2, null);
		   map.replace(2,"Jaggu");
		   l1.info("After updating 2 key value Updated Hashmap!!!");
		   l1.log(Level.INFO,()-> "Key-Value mappings: " + map.entrySet());
		   }  
		}  
