package home;
import javax.swing.*;
import java.awt.*;


public class EmployeeFormSample {
	
	public EmployeeFormSample() {
		JFrame form = new JFrame();
		// width, height
		form.setSize(300, 500);
		
		// x, y
		form.setLocation(1000, 0);
		

		JPanel panelMain = new JPanel();
//		panelMain.setLayout(new GridLayout(5, 1));
		panelMain.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelMain.setBackground(Color.YELLOW);
		
		
		JPanel panelRow1 = new JPanel();
		panelRow1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelRow1.setBackground(Color.CYAN);
		
		JLabel lblId = new JLabel("ID", JLabel.RIGHT);
		lblId.setSize(70, 30);
		
		JTextField txfId = new JTextField(12);
		
		panelRow1.add(lblId);
		panelRow1.add(txfId);
		
		
		JPanel panelRow2 = new JPanel();
		panelRow2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelRow2.setBackground(Color.PINK);
		
		JLabel lblName = new JLabel("Name");
		lblName.setSize(70, 30);

		JTextField txfName = new JTextField(12);

		panelRow2.add(lblName);
		panelRow2.add(txfName);
		
		panelMain.add(panelRow1);
		panelMain.add(panelRow2);
		

		form.add(panelMain);
		
		form.setVisible(true);
	}
	
	public static void main (String[] args) {
		new EmployeeFormSample();
	}

}
