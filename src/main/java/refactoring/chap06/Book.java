package refactoring.chap06;

public class Book {
	private String _title;
	private String _isbn;
	private String _price;
	private String _authorName;
	private String _authorMail;

	public Book(String title, String isbn, String price, String authorName, String authorMail) {
		_title = title;
		_isbn = isbn;
		_price = price;
		_authorName = authorName;
		_authorMail = authorMail;
	}

	public String get_title() {
		return _title;
	}

	public String get_isbn() {
		return _isbn;
	}

	public String get_price() {
		return _price;
	}

	public void set_authorName(String _authorName) {
		this._authorName = _authorName;
	}

	public void set_authorMail(String _authorMail) {
		this._authorMail = _authorMail;
	}

	public String toXml() {
		String author = tag("author",tag("name",_authorName)+tag("mail",_authorMail));
		String book = tag("book",tag("title",_title)+tag("isbn",_isbn)+tag("price",_price)+author);
		return book;
	}

	private String tag(String element, String content) {
		//String.format(element, content);
		return "<"+element+">"+content+"</"+element+">";
	}
}
