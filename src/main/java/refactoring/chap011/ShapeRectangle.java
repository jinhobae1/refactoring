package refactoring.chap011;

import refactoring.chap11.Shape;

public class ShapeRectangle extends Shape {
	private static final ShapeRectangle instance = new ShapeRectangle();

	public static ShapeRectangle getInstance(int startx, int starty, int endx, int endy) {
		instance.setShape(startx, starty, endx, endy);
		return instance;
	}


	private ShapeRectangle() {}

	@Override
	public String getName() {
		return "RECTANGLE";

	}

	public void draw() {
		System.out.printf("%15s:%s%n", "drawRectangle", this.toString());
	}
}
