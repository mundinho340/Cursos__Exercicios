package Jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//public class Myframee extends JFrame implements ActionListener{
public class Myframee extends JFrame{
	ImageIcon icon = new ImageIcon("game-over.png");
	JButton button = new JButton();
	Myframee(){
		button.setBounds(100, 100, 250, 100);
		button.setText("Botão do amor");
		button.addActionListener(e -> System.out.println("foho "));
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Arial Sans", Font.BOLD,25));
		button.setIconTextGap(-25);
		button.setForeground(Color.cyan);
		button.setBackground(Color.red);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setEnabled(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			System.out.println(" ...");
		}
		
	}*/
}
