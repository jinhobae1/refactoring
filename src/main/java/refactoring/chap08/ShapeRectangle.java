package refactoring.chap08;

public class ShapeRectangle extends Shape {

	private ShapeRectangle( int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);

	}
	public static Shape createShapeRectangle( int startx, int starty, int endx, int endy) {
		return new ShapeRectangle(startx, starty, endx, endy);
}
	
	@Override
	public int getTypecode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";

	}

	public void draw() {
		System.out.printf("%15s:%s%n", "drawRectangle", this.toString());
	}
}
