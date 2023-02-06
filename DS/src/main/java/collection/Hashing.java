package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashing {
	static Logger l1 = Logger.getLogger("com.api.jar");
	private String name;
	private int weight;
	Hashing(String n,int w){
		this.name = n;
		this.weight = w;
	}
	void getter() {
		l1.log(Level.INFO,()->"Fruit Name = "+name);
		l1.log(Level.INFO,()->"Weight of "+name+" is = "+weight);
		l1.info("-----------------");
	}
	public static void main(String [] args) {
		Hashing h = new Hashing("Graphs",2);
		Hashing h1 = new Hashing("Orange",3);
		Hashing h2 = new Hashing("Pomegranate",8);
		Hashing h3 = new Hashing("Apple",4);
		Hashing h4 = new Hashing("Orange",3);
		l1.log(Level.INFO,( )-> "Predefined Equlas method returns "+(h1==h4));
		HashSet<Hashing> a = new HashSet<>();
		a.add(h);
		a.add(h1);
		a.add(h2);
		a.add(h3);
		a.add(h4);
		l1.log(Level.INFO,()-> ""+ a);
		l1.log(Level.INFO,()-> "Overriden Equlas method returns "+(h1.equals(h4)));
		Iterator<Hashing> i=a.iterator();  
        while(i.hasNext())  
        {  
     	   i.next().getter();  
        }
	}
	
	@Override
	public boolean equals(Object b) {
		Hashing x = (Hashing)b;
		return x.name.equals(this.name)&& x.weight==this.weight;
	}
	
	@Override
	public int hashCode() {
		return this.weight*this.name.hashCode();
	}
}
