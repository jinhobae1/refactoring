package refactoring.chap07;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(ItemType.BOOK, "���� ����", 4800);
		Item dvd = new Item(ItemType.DVD, "������ �� Ư����", 3000);
		Item soft = new Item(ItemType.SOFTWARE, "Ʃ�� �ӽ� ���ķ�����", 3200);

		System.out.println("book=" + book.toString());
		System.out.println("dvd =" + dvd.toString());
		System.out.println("soft=" + soft.toString());
	}

}
