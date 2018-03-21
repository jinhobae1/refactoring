package refactoring.chap05;

public class Banner {
	private final String content;

	public Banner(String content) {
		this.content = content;
	}

	//template method
	public void print(int times) {
		printBorder();
		printContent(times);
		printBorder();
	}

	private void printBorder() {
		System.out.println("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.println("-");
		}
		System.out.println("+");
	}

	private void printContent(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("|" + content + "|");
		}
	}
}
