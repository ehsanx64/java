// All test classes are put into this package, so we need to import
import javatest.*;

public class JavaTest {
	public static void main (String[] args) {
		// Instantiate and call a class method
		HelloWorld hw = new HelloWorld();
		Integer repeats = 5;

		for (Integer i = 0; i < repeats; i++)
			hw.say();
	}
}
