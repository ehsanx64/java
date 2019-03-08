import java.util.*;

public class ValidParameters {
	private List<String> params;
	private ConsoleLib cl;

	public ValidParameters() {
		params = new ArrayList<String>();
		cl = new ConsoleLib();
	}

	public void processArgs(String[] args) {
		// Iterate through args and put valid parameters into params list
		for (int i = 0; i < args.length; i++) {
			// Any argument with - at the start is a valid parameter
			if (args[i].charAt(0) == '-') {
				params.add(args[i]);
			}
		}

		cl.printHeader("Overview:");
		System.out.println("Number of total arguments: " + args.length);
		System.out.println("Number of valid parameters: " + params.size() + "\n");
	} 

	public void listParameters() {
		cl.printHeader("Parameter list:");
		for (int i = 0; i < params.size(); i++) {
			System.out.println("Param " + (i + 1) + ": " + params.get(i));
		}
	}

	public static void main(String[] args) {
		ValidParameters p = new ValidParameters();
		p.processArgs(args);
		p.listParameters();
	}
}
