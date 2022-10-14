package cursojava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmetrica {
	public static void main(String [] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter a whole number to devid: ");
		x = scanner.nextInt();
		System.out.println("Enter a whole number to devid by: ");
		y =scanner.nextInt();
		z =x/y;
		System.out.println("Result "+z);
		}catch(ArithmeticException e) {
			System.out.println("You can't be devide by zero! idiot! "+e);
		}catch(InputMismatchException e) {
			System.out.println("You can't be devide by string! idiot! " +e);
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}finally {
			System.out.println("End");
		}
	}
}
