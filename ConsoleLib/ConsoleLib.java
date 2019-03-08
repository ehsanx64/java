public class ConsoleLib {
	private Integer bulletCount;
	private Character bulletChar;

	public ConsoleLib() {
		bulletCount = 3;
		bulletChar = '*';
	}

	private void drawBullets() {
		int i = 0;
		while (i++ < bulletCount) {
			System.out.print(bulletChar);
		}
	}

	public void printHeader(String title) {
		drawBullets();
		System.out.println(" " + title);
	}
}
