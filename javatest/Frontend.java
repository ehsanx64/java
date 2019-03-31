import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Frontend {
	private String frontendPath;
	private String args;
	private StringBuilder theProgram;
	
	public Frontend(String frontendPath) {
		this.setFrontend(frontendPath);
		this.theProgram = new StringBuilder();
		this.args = "";
	}

	public void setFrontend(String frontendPath) {
		this.frontendPath = frontendPath;
	}

	public void setProgram(String program) {
		this.theProgram.setLength(0);
		this.theProgram.append(program);
	}
	
	public String getProgram() {
		return theProgram.toString();
	}

	public String run() {
		StringBuilder output = new StringBuilder();

		try {
			// Run the program and save its handle
			String line;
			Process p;
			String execstr = frontendPath + " -c \"" + theProgram.toString() + "\"";
			out.println("Exec string: " + execstr);
			p = Runtime.getRuntime().exec(execstr);
			
			// Capture program's output from stdout and stderr
			BufferedReader bri = new BufferedReader
				(new InputStreamReader(p.getInputStream()));
			BufferedReader bre = new BufferedReader
				(new InputStreamReader(p.getErrorStream()));
			
			while ((line = bri.readLine()) != null) {
				output.append(line + "\n");
			}
			bri.close();
			
			while ((line = bre.readLine()) != null) {
				output.append(line + "\n");
			}
			bre.close();
			
			p.waitFor();
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return output.toString();
	}
	
	public static void main(String[] args) {
		Frontend f = new Frontend("bash");
		StringBuilder myProgram = new StringBuilder();
		myProgram = new StringBuilder("pwd;");
		myProgram.append("whoami;");
		f.setProgram(myProgram.toString());
		String result = f.run();
		out.println("The program: " + f.getProgram());
		out.println("Result: " + result);
	}
}
