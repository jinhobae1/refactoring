package refactoring.chapter12;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private final List<ValueListener> listeners;
	private int value;

	public Value(int value) {
		this.value = value;
		this.listeners = new ArrayList<>();

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListeners();
	}

	public void addValueListener(ValueListener listener) {
		this.listeners.add(listener);
	}

	private void notifyToListeners() {
		for (ValueListener listener : listeners) {
			listener.valueChanger(new ValueChangeEvent(this));
		}
	}
}