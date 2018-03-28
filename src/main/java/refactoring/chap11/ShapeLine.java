package refactoring.chap11;

public class ShapeLine extends Shape {
	public ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		return "Line";
	}

	public void draw() {
		System.out.printf("%15s:%s%n", "drawLine", this.toString());
	}

}
