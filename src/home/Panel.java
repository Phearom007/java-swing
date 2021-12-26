package home;

import java.awt.Color;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	
	public static void main (String[] args) {
	
		ImageIcon icon = new ImageIcon("flagcambodia.png");
	
		
		JLabel lbl = new JLabel();
		lbl.setIcon(icon);
		lbl.setVerticalAlignment(JLabel.TOP);
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setBounds(100,400,75,75);
		lbl.setBackground(Color.black);
		
		JPanel bluepanel1 = new JPanel();
		bluepanel1.setBackground(Color.blue);
		bluepanel1.setBounds(0,0,700,100);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,100,700,300);
		redpanel.add(lbl);
		
		JPanel bluepanel2 = new JPanel();
		bluepanel2.setBackground(Color.blue);
		bluepanel2.setBounds(0, 200,700,300);
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(750,750);
		f.setVisible(true);
		f.add(bluepanel1);
		f.add(redpanel);
		f.add(bluepanel2);
	
	}

}
