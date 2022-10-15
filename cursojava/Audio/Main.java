package Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//"C:/Users/chigarisso/workspace/cursojava/src/Audio/Kygo_-_Stranger_Things_ft._OneRepublic_(Official_Video)(256k).wav"

public class Main {
	public static void main(String [] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		File file = new File("C:/Users/chigarisso/workspace/cursojava/src/Audio/Kygo_-_Stranger_Things_ft._OneRepublic_(Official_Video)(256k).wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response ="";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S= stop, R= reset, Q= quit, T= +5");
			System.out.println("Choice your option: ");
			response = scanner.next().toUpperCase();
			switch(response) {
			case "P":
				clip.start();
				break;
			case "S":
				clip.stop();
				break;
			case "R":
				clip.setMicrosecondPosition(0);
				break;
			case "T":
				clip.setMicrosecondPosition((20));
			}
		}
	}
}
