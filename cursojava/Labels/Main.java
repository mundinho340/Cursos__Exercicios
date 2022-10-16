package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Main {
	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("C:/Users/chigarisso/workspace/cursojava/src/Jframe/game-over.png");
		Border border = BorderFactory.createLineBorder(Color.red, 3);
		JLabel labels = new JLabel();
		JFrame frame = new JFrame();
		labels.setText("Krypthon the best programming");
		labels.setIcon(image);
		labels.setHorizontalTextPosition(JLabel.CENTER);
		labels.setVerticalTextPosition(JLabel.TOP);		
		labels.setForeground(new Color(10,98,50));
		labels.setFont(new Font("MV Boli", Font.PLAIN,20));
		labels.setIconTextGap(-25);
		labels.setBackground(new Color(90,255,255));
		labels.setOpaque(true);
		labels.setBorder(border);
		labels.setVerticalAlignment(JLabel.CENTER);
		labels.setHorizontalAlignment(JLabel.CENTER);
		//labels.setBounds(0, 0, 400, 400);
		
		
		frame.setTitle("Krypthon");
		//frame.setSize(500, 500);
		//frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(labels);
		frame.pack();
	}
}
