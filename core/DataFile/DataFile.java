import static java.lang.System.*;
import java.io.*;

class DataFile {
	private String contents = "Hello there from files in Java";
	private String filename = "file.dat";
	private File f1;

	DataFile() {
		f1 = new File(filename);
	}

	private void writeFile() {
		int writtenBytes = 0;
		byte[] buffer = contents.getBytes();
		try {
			FileOutputStream fos = new FileOutputStream(f1);
			while (writtenBytes < buffer.length) {
				fos.write(buffer[writtenBytes]);
				writtenBytes++;
			}
			fos.close();
		} catch (Exception e) {
			out.println("An error occured while trying to write to file: " + filename);
		}
	}

	private void readFile() {
		char[] buffer = new char[1024];
		try {
			FileInputStream fis = new FileInputStream(f1);
			out.println("File size: " + f1.length());
			for (int i = 0; i < f1.length(); i++) {
				if (i >= buffer.length) {
					out.println("Buffer limit reached, breaking with result as is");
				} else {
					buffer[i] = (char) fis.read();
				}
			}
			fis.close();
			out.println("File contents:");
			out.println(buffer);
		} catch (Exception e) {
			out.println("There was an error reading the file: " + filename);
		}
	}

	private void mainMethod() {
		if (f1.exists() && f1.isFile()) {
			out.println("File exists, reading...");
			readFile();
		} else {
			out.println("File does not exists, going to create one...");
			writeFile();
		}
	}


	public static void main (String[] args) {
		DataFile df = new DataFile();
		df.mainMethod();
	}
}
