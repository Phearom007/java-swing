package home;
import javax.swing.*;
import java.awt.*;

public class GridLayoutForm1 {
	
	JFrame f;
	
	GridLayoutForm1(){
		
		f = new JFrame("Employee Form");
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		int x=30, y=50;
		int lblWidth=100;
		int lblHeight=30;
		int txfWidth=320;
		int txfHeight=30;
		
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(x, y, lblWidth, lblHeight);
		f.add(lblId);
		
		JTextField txfId = new JTextField();
		txfId.setBounds(x + lblWidth, y, txfWidth, txfHeight);
		f.add(txfId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(x, y*2, lblWidth, lblHeight);
		f.add(lblName);
		
		JTextField txfName = new JTextField();
		txfName.setBounds(x + lblWidth, y*2, txfWidth, txfHeight);
		f.add(txfName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(x, y*3, lblWidth, lblHeight);
		f.add(lblGender);
		
		ButtonGroup btgGender = new ButtonGroup();
		JRadioButton rbtMale = new JRadioButton("Male");
		JRadioButton rbtFemale = new JRadioButton("Female");
		btgGender.add(rbtMale);
		btgGender.add(rbtFemale);
		
		JPanel panelGender = new JPanel();
		panelGender.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelGender.add(rbtMale);
		panelGender.add(rbtFemale);
		panelGender.setBounds(x + lblWidth, y*3, txfWidth, txfHeight);
		f.add(panelGender);
		
		JButton addbtn = new JButton("Add");
		addbtn.setBounds(x, y*4, lblWidth, lblHeight);
		f.add(addbtn);
		
	
		
		f.setLayout(new GridLayout(5,4));    
	    f.setSize(500,500);   
	    
		JTextField txf = new JTextField();
		txf.setBounds(x, y*5, lblWidth + txfWidth, txfHeight*5);
		f.add(txf);
	    
	    f.setVisible(true);   
	    
	}
	
	public static void main(String[] args) {    
	    new GridLayoutForm1();    
	}    

}
