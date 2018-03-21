package refactoring.chap04;

public class Label {
	
	
	private String _label;
	public Label(String label) {
		_label = label;
	}
	
	
	//factory method
	public static Label newNull() {
		return new NullLabel();
	}
	
	
	public void display() {
		System.out.println("display:"+_label);
	}
	public String toString() {
		return "\""+_label+"\"";
	}
	
	public boolean isNull() {
		return false;
	}
	
}
