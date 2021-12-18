package home;

import java.awt.*;
import javax.swing.*;


public class MyForm2 extends JFrame{
	private Container c;
	private JTextField tf;
	private JButton bt;
	private JCheckBox ch;
	
	


	public MyForm2() {
		c=getContentPane();
		c.setLayout(null);
		tf=new JTextField();
		tf.setBounds(100,50,150,20);
		c.add(tf);
		bt=new JButton("Add");
		bt.setBounds(255,50,80,20);
		c.add(bt);
		ch=new JCheckBox("Male");
		ch.setBounds(100,75,100,20);
		c.add(ch);
		
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new MyForm2();
	}
}