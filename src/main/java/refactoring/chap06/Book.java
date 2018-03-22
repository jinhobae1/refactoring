package refactoring.chap06;

public class Book {
	private String _title;
	private String _isbn;
	private String _price;
	private Author author = new Author();

	public Book(String title, String isbn, String price, String authorName, String authorMail) {
		_title = title;
		_isbn = isbn;
		_price = price;
		author.name = authorName;
		author.mail = authorMail;
	}



	public String get_title() {
		return _title;
	}



	public void set_title(String _title) {
		this._title = _title;
	}



	public String get_isbn() {
		return _isbn;
	}



	public void set_isbn(String _isbn) {
		this._isbn = _isbn;
	}



	public String get_price() {
		return _price;
	}



	public void set_price(String _price) {
		this._price = _price;
	}



	public String get_authorName() {
		return author.name;
	}



	public void set_authorName(String _authorName) {
		this.author.name = _authorName;
	}



	public String get_authorMail() {
		return author.mail;
	}



	public void set_authorMail(String _authorMail) {
		this.author.mail = _authorMail;
	}



	public String toXml() {
		String author = tag("author",tag("name",this.author.getName())+tag("mail",this.author.getMail()));
		String book = tag("book",tag("title",_title)+tag("isbn",_isbn)+tag("price",_price)+author);
		return book;
	}

	private String tag(String element, String content) {
		//String.format(element, content);
		return "<"+element+">"+content+"</"+element+">";
	}
}
