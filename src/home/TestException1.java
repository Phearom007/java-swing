package home;
import java.io.*;

public class TestException1 {
	BufferedReader in;
	
	void out(String m) {
		System.out.print(m);
	}
	int readInt(String I) {
		try {
			return Integer.parseInt(readString(I));
		} catch(NumberFormatException e) {
		e.printStackTrace();
		return 0;
	}

}

	String readString(String I) {
		out (I);
		String x;
		try {
			x=in.readLine();
		}catch(Exception e) {
			e.printStackTrace();
			x="Error!";
		}
		return x;
	}
	
	public TestException1() {
		in=new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int age;
		name=readString("Enter Name: ");
		age=readInt("Enter Age: ");
		out("Your name is "+name+ " and age ="+age);
	}
	
	public static void main (String[] args) {
		new TestException1();
	}
}