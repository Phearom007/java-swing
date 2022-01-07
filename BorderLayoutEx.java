package home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutEx extends JFrame{
	
	private Container c;
	private JPanel p;
	private JButton b1,b2,b3,b4,b5;
	
	public void initUI() {
		c = getContentPane();
		p = new JPanel();
		p.setLayout(new BorderLayout());
		
		b1 = new JButton ("One");
		p.add(b1,"North");
		b2 = new JButton ("Two");
		p.add(b1,"South");
		b3 = new JButton ("Three");
		p.add(b3,"East");
		b4 = new JButton ("Four");
		p.add(b4,"West");
		b5 = new JButton ("Five");
		p.add(b5,"Center");
		c.add(p);
	}
	
	public void initForm() {
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public BorderLayoutEx() {
		
		initUI();
		initForm();
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
