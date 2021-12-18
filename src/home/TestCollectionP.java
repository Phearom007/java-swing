package home;

import java.util.ArrayList;
import javax.swing.*;
public class TestCollectionP {
	private ArrayList<Product>list;
	
	void addProduct() {
		do {
			list.add(getProduct());
		} while (readString("Yes or No?").equalsIgnoreCase("yes"));
		
	}
	void showProduct(){
		String report="All products\n";
		for(Object x:list)
			report+=x.toString();
		out(report);
		
	}
	
	Product getProduct() {
		int c=readInt("Code");
		String n=readString("Name");
		double p=readDouble("Price");
		return new Product(c,n,p);
	}
	double readDouble(String I) {
		return Double.parseDouble(readString(I));
	}
	int readInt(String I) {
		return Integer.parseInt(readString(I));
	}
	String readString(String I) {
		return JOptionPane.showInputDialog(I);
	}
	void out(String m) {
		JTextArea d=new JTextArea(m,10,50);
		JOptionPane.showMessageDialog(null, d);
		
	}
	public TestCollectionP() {
		list=new ArrayList<Product>();
		addProduct();
		showProduct();
		
	}
	public static void main(String [] args) {
		new TestCollectionP();
	}

}
