package home;
import javax.swing.*;
import java.awt.*;


public class EmployeeFormSample {
	
	public EmployeeFormSample() {
		JFrame form = new JFrame();
		// width, height
		form.setSize(300, 500);
		
		// x, y
		GridLayout grid1 = new GridLayout(5, 1);
		grid1.setHgap(1);
		grid1.setVgap(1);
		
		form.setLocation(1000, 0);
		form.setLayout(new FlowLayout());
		

		JPanel panelMain = new JPanel();
		panelMain.setLayout(grid1);
//		panelMain.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 2));
		panelMain.setBackground(Color.YELLOW);
		
		
		FlowLayout flow1 = new FlowLayout(FlowLayout.LEFT);
		flow1.setHgap(10);              
		flow1.setVgap(10);
		
		JPanel panelRow1 = new JPanel();
		panelRow1.setLayout(flow1);
		panelRow1.setBackground(Color.CYAN);
	
		
		JLabel lblId = new JLabel("ID");
//		lblId.setSize(170, 30);
		
		JTextField txfId = new JTextField(12);
//		txfId.setSize(170, 30);
		
		panelRow1.add(lblId);
		panelRow1.add(txfId);
		
		
		JPanel panelRow2 = new JPanel();
		panelRow2.setLayout(flow1);
		panelRow2.setBackground(Color.PINK);
		panelRow2.setSize(200, 70);
		
		JLabel lblName = new JLabel("Name");
		lblName.setSize(70, 30);

		JTextField txfName = new JTextField(12);
		txfName.setSize(170, 30);
		
		panelRow2.add(lblName);
		panelRow2.add(txfName);
		
//		panelMain.add(panelRow1);
//		panelMain.add(panelRow2);
		

//		form.add(panelMain);
		form.add(panelRow1);
		form.add(panelRow2);
		
		form.setVisible(true);
	}
	
	
}
