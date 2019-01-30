// All test classes are put into this package, so we need to import
import javatest.*;
import javatest.ArrayList;
import javatest.helloworld.*;

public class JavaTest {
	public static void main (String[] args) {
		JavaTest javatest = new JavaTest();

		// Test HelloWorld
		// javatest.testHelloWorld();

		// Test ArrayList
		javatest.testArrayList();
	}

	private void testHelloWorld() {
		// Instantiate and call a class method
		HelloWorld hw = new HelloWorld();
		Integer repeats = 5;

		for (Integer i = 0; i < repeats; i++)
			hw.say();
	}

	private void testArrayList() {
		ArrayList al = new ArrayList();
		al.test1();
	}
}
