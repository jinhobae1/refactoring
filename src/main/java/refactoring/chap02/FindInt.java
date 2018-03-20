package refactoring.chap02;

public class FindInt {
	public static boolean find(int[] date, int target) {
		boolean found = false;
		for (int i = 0; i < date.length && !found; i++) {
			if (date[i] == target) {
				return true;
			}
		}
		return false;
	}
}
