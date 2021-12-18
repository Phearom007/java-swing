import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import home.Employee;  

public class SwingApp1 {  
	
	public static void main(String[] args) {
	    // System.out.println("Hello world!");

	    // long total1 = 2147483647L + 2147483647L;
	    // long total2 = sum(2147483647, 2147483647);
	    // System.out.println("Total 1: " + total1);
	    // System.out.println("Total 2: " + total2);

	    // int result = 2147483647 - 2147483647;
	    // System.out.println("Result: " + result);

	    // new TestArray();
	    
	   // TestCollection collect = new TestCollection();
	    //collect.pirntClassName();

	    //collect.printStaticMethod();

	   // TestCollection.printStaticMethod();

	    // TestCollection.pirntClassName();

	    Employee emp = new Employee();
	    System.out.println(emp.toString());

	    Employee emp2 = new Employee();
	    emp2.setId(2);
	    emp2.setName("Employee2");
	    emp2.setSalary(1000);

	    List<Employee> arr1 = new ArrayList<Employee>();
	    arr1.add(emp);
	    arr1.add(emp2);

	    System.out.println(arr1);
	    
	  }

	  public static long sum(int a, int b) {
	    return (long) a + (long) b;
	  }

	  public static int minus(int x, int y) {
	    return x - y;
	  }
	
}  