package refactoring.chap06;

public class Author {
	public String name;
	public String mail;

	public Author() {
	}

	public Author(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}