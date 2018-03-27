package refactoring.chapter10;

public class Direction {

	public int Px;
	public int Py;

	public Direction(int x, int y) {
		Px = x;
		Py = y;
	}

	public void setDirection(int x, int y) {
		Px += x;
		Px += y;
	}
}
