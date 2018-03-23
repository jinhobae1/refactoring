package refactoring.chap08;

public class ShapeTriangle extends Shape {

	public ShapeTriangle(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_TRIANGLE;
	}

	@Override
	public String getName() {
		return "TRIANGLE";
	}

	@Override
	public void draw() {
		System.out.printf("%15s:%s%n", "drawTriangel", this.toString());
	}

}
