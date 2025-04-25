import java.util.*;

public class ProgramArgs {
	private List<String> params;

	public ProgramArgs() {
		params = new ArrayList<String>();
	}

	public void processArgs(String[] args) {
		// Iterate through args and put valid parameters into params list
		for (int i = 0; i < args.length; i++) {
			// Any argument with - at the start is a valid parameter
			if (args[i].charAt(0) == '-') {
				params.add(args[i]);
			}
		}

		System.out.println("Number of total arguments: " + args.length);
		System.out.println("Number of valid parameters: " + params.size() + "\n");
	} 

	public void listParameters() {
		for (int i = 0; i < params.size(); i++) {
			System.out.println("Param " + (i + 1) + ": " + params.get(i));
		}
	}

	public static void main(String[] args) {
		ProgramArgs p = new ProgramArgs();
		p.processArgs(args);
		p.listParameters();
	}
}
