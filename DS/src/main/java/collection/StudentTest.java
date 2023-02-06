package collection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
	private String name;
	private int age;
	private float gpa;
	void setter(String n,int a,float g){
		this.name = n;
		this.age = a;
		this.gpa = g;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getGpa() {
		return Float.toString(gpa);
	}
}
public class StudentTest {
	public static void main(String[] arg) {
		List<Student> list=new ArrayList<Student>(); 
		Logger l1 = Logger.getLogger("com.api.jar");
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s.setter("Janani",21,9.21f);
		s1.setter("Nivi",23,9.44f);
		s2.setter("Jaggu",19,9.20f);
		s3.setter("Shubha Laximi",22,9.21f);
		s4.setter("Abinaiya ",24,9.00f);
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o2.getGpa().compareTo(o1.getGpa());
			}
		});
		l1.info("Ranking Order");
		for (Student l:list) {
			l1.log(Level.INFO,()-> "Name : "+ l.getName());
			l1.log(Level.INFO,()->"GPA : "+ l.getGpa());
			l1.info("-----------------------");
		}
	}
}
