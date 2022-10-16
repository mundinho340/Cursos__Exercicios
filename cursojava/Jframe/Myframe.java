package Jframe;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame{
	Myframe(){
		this.setTitle("Mundas vlog");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		ImageIcon image = new ImageIcon("C:/Users/chigarisso/workspace/cursojava/src/Jframe/game-over.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0,94,35));
		this.setVisible(true);
	}
}
