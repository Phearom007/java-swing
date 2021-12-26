package home;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameForm1 extends JFrame{
	private Container c;
	private JLabel l1,l2,l3;
	private JRadioButton ch1,ch2,ch3;
	private ButtonGroup g;
	private JTextField tf;
	private JButton bt;
	private JTextArea a;
	
	int getRandom(int min, int max) {
		return min+(int)(Math.random()*(max-min+1));
	}
	//event
	
	void addEvent() {
		bt.addActionListener(new ActionListener() {
			
			
			@Override
			
			public void actionPerformed (ActionEvent e) {
				int y,m=0;
				String result;
				if(ch1.isSelected()) m = getRandom(0,9);	
				if(ch2.isSelected()) m = getRandom(10,99);
				if(ch3.isSelected()) m = getRandom(100,999);
				y=Integer.parseInt(tf.getText().toString());
				result = y +":"+ m;
				
				if(y>m) {
					result +=" Win!!!";
				}else if (y==m) {
					result += "Draw !!!";
				}
				else {
					result +=" Lose!!!";
				}
				a.setText(result);
						
			}
		});
	}
	
	//initial UI
	
	void initGUI() {
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("Play Game Random!");
		l1.setBounds(250,50,200,20);
		c.add(l1);
		
		l2=new JLabel("Type");
		l2.setBounds(100,80,60,20);
		c.add(l2);
		
		ch1= new JRadioButton ("One");
		ch1.setBounds(165,80,60,20);
		c.add(ch1);
		
		ch2= new JRadioButton ("Two");
		ch2.setBounds(230,80,60,20);
		c.add(ch2);
		
		ch3= new JRadioButton ("Three");
		ch3.setBounds(295,80,60,20);
		c.add(ch3);
		
		l3=new JLabel("Your num");
		l3.setBounds(100,105,100,20);
		c.add(l3);
		
		g= new ButtonGroup();
		g.add(ch1);
		g.add(ch2);
		g.add(ch3);
		
		tf= new JTextField();
		tf.setBounds(205,105,200,20);
		c.add(tf);
		
		bt = new JButton("Play");
		bt.setBounds(100,130,60,20);
		c.add(bt);
		
		a= new JTextArea();
		a.setBounds(100,160,300,150);
		c.add(a);
		
		
	}
	public GameForm1() {
		
		initGUI();
		addEvent();
		initForm();
		
	}
	//initial form
	
	void initForm() {
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GameForm1();
	}

}
