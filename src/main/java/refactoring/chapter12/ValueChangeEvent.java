package refactoring.chapter12;

public class ValueChangeEvent {
	private final Value source;

	public ValueChangeEvent(Value sources) {
		source = sources;
	}

	public Value getSource() {
		return source;
	}

}
