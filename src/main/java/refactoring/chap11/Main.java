package refactoring.chap11;

import java.util.Arrays;
import java.util.List;

import refactoring.chap11.FactoryShape.ShapeType;

public class Main {
	public static void main(String[] args) {
		Shape line = Shape.createLine(0, 0, 100, 200);
		Shape rectangle = Shape.createRectae(10, 20, 30, 40);
		Shape oval = Shape.createOval(100, 200, 300, 400);
		
		Shape[]shape= {
				line,
				rectangle,
				oval
		};
		
	/*	List<Shape> shapes = Arrays.asList(FactoryShape.createShape(ShapeType.Line, 0, 0, 100, 200));
		FactoryShape.createShape(ShapeType.RECTANGLE, 0, 0, 100, 200);
		FactoryShape.createShape(ShapeType.OVAL, 0, 0, 100, 200);*/

		for (Shape s : shape) {
			s.draw();
		}
	}
}
