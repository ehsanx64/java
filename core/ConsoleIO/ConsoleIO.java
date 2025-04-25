import java.io.Console;

public class ConsoleIO {
	public static void main(String[] args) {
		ConsoleIO cio = new ConsoleIO();
		cio.askUserNameAndGreet();
	}

	/**
	 * Ask for username and display a greeting message using the input
	 */
	public void askUserNameAndGreet() {
		Console cons = System.console();

		// Ask for the user name and read a line of input
		System.out.print("Please enter your name: ");
		String name = cons.readLine();
		
		// Greet the user using the provided name
		System.out.println("Hello dear " + name + "! How are you?");
	}
}

