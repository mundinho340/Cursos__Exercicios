package Jframe;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1 {
	public static void main(String args[]) {
		JPanel redPanel = new JPanel();
		JPanel greenPanel = new JPanel();
		JPanel yellowPanel =new JPanel();
		JPanel blackPanel =new JPanel();
		JPanel whitePanel=new JPanel();
		//red
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		//green
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,250,250);
		//yellow
		//black
		//white
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(greenPanel);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
