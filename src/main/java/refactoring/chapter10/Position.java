package refactoring.chapter10;

public class Position {
	public int Px;
	public int Py;
	public Position(int x,int y) {
		Px=x;
		Py=y;
	}
	public void relativeMove(int x,int y) {
		Px+=x;
		Px+=y;
	}
}
