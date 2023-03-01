package student;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class StudentTest {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static int age;
	static double gpa;
	static boolean storeInt() {
		Scanner scan = new Scanner(System.in);
		try {
    	age = scan.nextInt();
    	return false;
		}
		catch(InputMismatchException e) {
	    return true;
		}
	}
	static boolean storeDouble() {
		Scanner scan = new Scanner(System.in);
		try {
    	gpa = scan.nextDouble();
    	return false;
		}
		catch(InputMismatchException e) {
	    return true;
		}
	}
	public static void main(String[] arg) {
		String name;
		char b;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		List<Student> list=new ArrayList<Student>(); 
		display.println("Enter the Student Details :" );
		do {
			display.print("Student Name : ");
			name = scan1.nextLine();
			do {
			    display.print("Age : ");
			}while(storeInt());
			do{
				display.print("GPA : ");
			}while(storeDouble());
			list.add(new Student(name,age,gpa));
			display.print("Do you want to add more Y/N (or) y/n: ");
			b = scan.next().charAt(0);
		}while(b == 'Y' || b == 'y');
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o2.getGpa().compareTo(o1.getGpa());
			}
		});
		int i=1;
		for (Student div:list) {
			display.println("Student "+(i++)+" Details");
			display.println ("Name : "+ div.getName());
			display.println("GPA : "+ div.getGpa());
			display.println("-----------------------");
		}
	}
}
