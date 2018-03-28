package refactoring.chap11;

import refactoring.chap011.ShapeRectangle;

public class ShapeOval extends Shape {
	
	public ShapeOval(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		return "OVAL";

	}

	public void draw() {
		System.out.printf("%15s:%s%n", "drawOval", this.toString());
	}
}
