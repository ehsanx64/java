import javax.swing.*;

public class SwingTest extends JFrame {
	public SwingTest() {
		super("SwingTest");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		super.add(new JLabel("Hello, world"));
		super.pack();
		super.add(new JLabel("Hey"));
		super.pack();
		super.setVisible(true);
	}

	public static void main(final String[] args) {
		new SwingTest();
	}
}
