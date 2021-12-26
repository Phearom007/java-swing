package home;


import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class JFrameGUI {
	
	
	public static void main (String[] args) {
		
		JFrame f = new JFrame();
		
		ImageIcon image = new ImageIcon("download.png");
		f.setIconImage(image.getImage());
//		f.getContentPane().setBackground(new Color (123,60,250));
		
		Border border = BorderFactory.createLineBorder (Color.green,3);
		
		JLabel lbl = new JLabel();
		
		lbl.setText("Do you have any question about GUI?");
		lbl.setIcon(image);
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.TOP);
		lbl.setForeground(new Color(0x00FF00));
		lbl.setFont(new Font("MV Boli",Font.PLAIN,20));
		lbl.setIconTextGap(-25);
		lbl.setBackground(Color.black);
		lbl.setOpaque(true);
		lbl.setBorder(border);
		lbl.setVerticalAlignment(JLabel.CENTER);
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		
		f.setTitle("JFrame GUI");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setResizable(false);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(lbl);
		
		
	}

}
