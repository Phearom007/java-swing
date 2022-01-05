package home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestStudentForm extends JFrame{
	
	
	private Container c;
	private JLabel l1,l2,l3,l4,l5,l6;
	private JTextField tfi,tfn,tfy;
	private ButtonGroup g;
	private JRadioButton ch1,ch2;
	private JComboBox jcb;
	private JButton bta,bte;
	private JTextArea d;
	private JScrollPane jsp;
	
	
	void initUI() {
		
		c = getContentPane();
		c.setLayout(null);
		
		l1 = new JLabel ("TestStudentForm");
		l1.setBounds (150,30,150,20);
		c.add(l1);
		
		l2 = new JLabel ("ID");
		l2.setBounds(100,55,60,20);
		c.add(l2);
		
		tfi = new JTextField();
		tfi.setBounds(165, 55, 150, 20);
		c.add(tfi);
		
		l3 = new JLabel ("Name");
		l3.setBounds(100, 80, 60, 20);
		c.add(l3);
		
		tfn = new JTextField();
		tfn.setBounds(165, 80, 150, 20);
		c.add(tfn);
		
		l4 = new JLabel ("Gender");
		l4.setBounds(100, 105, 60, 20);
		c.add(l4);
		
		g = new ButtonGroup();
		ch1 = new JRadioButton ("Male");
		ch1.setBounds(165, 105, 80, 20);
		c.add(ch1);
		
		ch2 = new JRadioButton ("Female");
		ch2.setBounds (250, 105, 80, 20);
		c.add(ch2);
		g.add(ch1);
		g.add(ch2);
		
		l5 = new JLabel ("Gender");
		l5.setBounds(100, 130, 60, 20);
		c.add(l5);
		
		jcb = new JComboBox();
		jcb.setBounds(165, 130, 150, 20);
		c.add(jcb);
		jcb.addItem("A1");
		jcb.addItem("A2");
		jcb.addItem("A3");
		jcb.addItem("A4");
		jcb.addItem("A5");
		
		l6 = new JLabel ("Year");
		l6.setBounds(100, 155, 60, 20);
		c.add(l6);
		
		tfy = new JTextField();
		tfy.setBounds(165, 155, 150, 20);
		c.add(tfy);
		
		bta = new JButton ("Add");
		bta.setBounds(100, 180, 60, 20);
		c.setLayout(null);
		c.add(bta);
		
		bte = new JButton ("Exit");
		bte.setBounds(100, 180, 60, 20);
		c.add(bte);
		
		d = new JTextArea();
		
		jsp = new JScrollPane();
		jsp.setBounds(100, 205, 250, 200);
		c.add(jsp);
		
		
	}
	

	void initForm() {
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		
	}
	
	public TestStudentForm() {
		
		initUI();
		initForm();
	}

		public static void main (String[] args) {
			new TestStudentForm();
			
		}
	}


