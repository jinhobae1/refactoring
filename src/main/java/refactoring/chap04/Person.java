package refactoring.chap04;



public class Person {
	private Label _name;
	private Label _mail;
	public Person(Label name,Label mail) {
		_name = name;
		_mail = mail;
	}
	public Person(Label name) {
		this(name,null);
	}

	public void display() {
		if (_name != null) {
			_name.display();
		}
		if (_mail != null) {
			_mail.display();
		}

	}
	
	
	public Label get_name() {
		return _name;
	}
	public Label get_mail() {
		return _mail;
	}
	@Override
	public String toString() {
		return "Person [_name=" + _name + ", _mail=" + _mail + "]";
	}
	
	
}
