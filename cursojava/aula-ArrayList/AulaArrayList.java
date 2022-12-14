package olll;

import java.util.ArrayList;
import java.util.Collections;

public class AulaArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Bmw");
		cars.add("range-rover");
		cars.add("Toyota");
		cars.add("Cadillac");
		
		cars.remove(1);
		System.out.println(cars.get(2));
		System.out.println(cars);
		Collections.sort(cars);
		System.out.println(cars);
	}
}
