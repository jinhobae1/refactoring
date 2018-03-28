package refactoring.chap11;

public abstract class Shape {
	private int startx;
	private int starty;
	private int endx;
	private int endy;

	public static Shape createLine(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}

	public static Shape createRectae(int startx, int starty, int endx, int endy) {
		return new ShapeRectangle(startx, starty, endx, endy);
	}

	public static Shape createOval(int startx, int starty, int endx, int endy) {
		return new ShapeOval(startx, starty, endx, endy);
	}

	protected Shape(int startx, int starty, int endx, int endy) {
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;

	}

	@Override
	public String toString() {
		return String.format("[%-10s,(%3s,%3s)-(%3s,%3s)]", getName(), startx, starty, endx, endy);
	}

	public abstract String getName();
	public abstract void draw();
	
	private void drawOval() {
		System.out.printf("%15s:%s%n", "drawOval", this.toString());
	}

	private void drawRectangle() {
		System.out.printf("%15s:%s%n", "drawRectangle", this.toString());

	}

	private void drawLine() {
		System.out.printf("%15s:%s%n", "drawLine", this.toString());
	}
}
