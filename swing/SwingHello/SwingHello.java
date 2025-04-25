import javax.swing.*;

public class SwingHello extends JFrame {
	public SwingHello() {
		super("SwingHello");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		super.add(new JLabel("Hello world from Swing"));
		super.pack();
		super.add(new JLabel("Hey"));
		super.pack();
		super.setVisible(true);
	}

	public static void main(final String[] args) {
		new SwingHello();
	}
}
