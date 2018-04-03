package refactoring.chap11;

public class ShapeRectangle extends Shape {

	public ShapeRectangle( int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);

	}

	@Override
	public String getName() {
		return "RECTANGLE";

	}

	public void draw() {
		System.out.printf("%15s:%s%n", "drawRectangle", this.toString());
	}
}
