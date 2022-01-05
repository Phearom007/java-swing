package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutEx extends JFrame{
	
	private Container c;
	private JPanel p;
	private JButton b1,b2,b3,b4,b5,b6;
	
	
	public void initUI() {
		c = getContentPane();
		c = new JPanel();
		p.setLayout(new GridLayout(2,3));
		
		b1 = new JButton("One");
		p.add(b1);
		b2 = new JButton("Two");
		p.add(b2);
		b3 = new JButton("Three");
		p.add(b3);
		b4 = new JButton("Four");
		p.add(b4);
		b5 = new JButton("Five");
		p.add(b5);
		b6 = new JButton("Six");
		p.add(b6);
		c.add(p);
		
	}
	
	public void initForm() {
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public GridLayoutEx() {
		initUI();
		initForm();
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
