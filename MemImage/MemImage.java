import static java.lang.System.*;
import java.nio.*;

class MemImage {
	private String filename = "file.dat";

	MemImage() {
	}

	// Create a ByteBuffer and initialize with some dummy values
	private static ByteBuffer initBuffer() {
		ByteBuffer buff = ByteBuffer.allocate(12 * 1024);
		int initVal = 2_114_345_418;
		
		while (buff.hasRemaining()) {
			initVal += 1024;
			buff.putInt(initVal++);
		}

		buff.rewind();
		return buff;
	}

	private void dump(ByteBuffer buffer) {
		// Becuase buffer has an internal pointer, position it at the beginning
		buffer.position(0);

		// Counter for bytes that has been read
		int i = 0;

		// How many bytes to view in each line
		int bytePerLine = 20;

		// Counter for printing address header to the left of byte dump
		int j = 0;

		// Keeping value of address
		int addr = 0;

		// How many bytes in each group
		int bytePerGroup = 4;

		// Counter for groups
		int g = 0;

		// Print size (limit) of buffer
		out.println("Buffer limit: " + buffer.limit());

		// Main dump loop
		while (i++ < buffer.limit()) {
			// Maximum bytes to display in a line reached
			if (j == bytePerLine) {
				j = 0;
			}

			// We should move on to the next line print address and increase addr
			if (j == 0) {
				out.println();
				out.printf("%04X | ", addr);
				addr += bytePerLine;	
			}

			// Everything else has been taken care of, print bytes
			out.printf("%02X ", buffer.get());
			j++;
			g++;

			// Group limit reached?
			if (g == bytePerGroup) {
				out.print(" ");
				g = 0;
			}
		}

		// Dump finished, print a new line for beautifulnesses sake :-))
		out.println();
	}

	// TODO
	private void writeFile() {
	}

	// TODO
	private void readFile() {
	}

	private void mainMethod() {
		ByteBuffer mem = initBuffer();
		dump(mem);
	}


	public static void main (String[] args) {
		MemImage mi = new MemImage();
		mi.mainMethod();
	}
}
