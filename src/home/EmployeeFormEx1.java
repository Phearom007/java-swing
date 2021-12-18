package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeFormEx1 {
	
	private JFrame f;
	public EmployeeFormEx1() {
		f=new JFrame ("Employee Form");
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
//		male.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				if(male .isSelected()) {
//					
//				}
//			}
//		});
		
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
		
//		
//		JTextArea txa = new JTextArea();
//		txa.setBounds(x, y*5, txfHeight+txfHeight, txfWidth);
//		f.add(txa);
		
		JTextField txf = new JTextField();
		txf.setBounds(x, y*5, lblWidth+txfWidth, txfHeight*5);
		f.add(txf);
		
		


		
		f.setVisible(true);
				
	}

}
