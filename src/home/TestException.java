package home;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class TestException {
	
	public static void main(String [] args) {
//		Scanner in=new Scanner(System.in);
//		double a,b,c;
//		System.out.print("Enter A=");
//		a=in.nextDouble();
//		System.out.print("Enter B=");
//		b=in.nextDouble();
//		try {
//			c=a+b;
//			System.out.println(c);
//		
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		String text = null;
		
//		try {
//			text.toLowerCase();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		text = "hello world";
//		
//		try {
//			System.out.println(text.length());
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
		
//	
//		throw new Exception("I can't find the employee id 1000");
		
		EmployeeData database = new EmployeeData();
		
		database.insert(new Employee(1, "Dara", 1900));
		database.insert(new Employee(2, "Jonh", 1700));

		database.deleteById("2");
		
		try {
			Employee employee = database.find("2");
			System.out.println(employee);
		} catch (EmployeeNotFound ex) {
			ex.printStackTrace();
		}
		
		
		// CRUD
		// Create Read Update Delete
		
	}

	
	
	

}
