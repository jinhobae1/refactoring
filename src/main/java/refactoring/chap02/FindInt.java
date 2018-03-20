package refactoring.chap02;

public class FindInt {
	public static boolean find(int[] date, int target) {
		for (int i = 0; i < date.length; i++) {
			if (date[i] == target) {
				return true;
			}
		}
		return false;
	}
}
