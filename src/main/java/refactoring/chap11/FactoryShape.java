package refactoring.chap11;

import java.awt.Rectangle;

public class FactoryShape {
	public enum ShapeType{
		Line,RECTANGLE,OVAL
	}
	/*public static Shape createShape(ShapeType type,int startx,int starty,int endx, int endy) {
		switch (type) {
		case Line:
			return ShapeLine.getInstance(startx, starty, endx, endy);
		case RECTANGLE:
			return ShapeRectangle.getInstance(startx,starty,endx,endy);
		case OVAL:
			return ShapeOval.getInstance(startx,starty,endx,endy);
		default:
			return null;
		}
	}*/
	
}
