package cursojava;
import java.io.File;
public class Main {
	public static void main(String [] args) {
		File file = new File("C:/Users/chigarisso/Desktop/Text_Message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists! :)");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		}
		
		else {
			System.out.println("That file doesnt exists! :(");
		}
	}
}
