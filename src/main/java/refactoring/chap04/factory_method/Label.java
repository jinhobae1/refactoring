package refactoring.chap04.factory_method;

public class Label {

	private String _label;

	public Label(String label) {
		_label = label;
	}

	// factory method
	public static Label newNull() {
		return NullLabel.getInstance();
	}

	public void display() {
		System.out.println("display:" + _label);
	}

	public String toString() {
		return "\"" + _label + "\"";
	}

	public boolean isNull() {
		return false;
	}

	private static class NullLabel extends Label {
		private static final NullLabel instance = new NullLabel();

		public static NullLabel getInstance() {
			return instance;
		}

		private NullLabel() {
			super("(none)");
		}

		@Override
		public void display() {

		}

		@Override
		public boolean isNull() {
			return true;
		}
	}
}
