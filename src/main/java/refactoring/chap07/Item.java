package refactoring.chap07;

public class Item {

	private ItemType itemtype;
	private final String title;
	private final int price;

	public Item(ItemType itemType, String title, int price) {
		super();
		this.itemtype = itemType;
		this.title = title;
		this.price = price;
	}

	public int getTypecode() {
		return itemtype.getTypecode();
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return " [" + getTypecode() + "," + getTitle() + "," + getPrice() + "]";
	}

}
