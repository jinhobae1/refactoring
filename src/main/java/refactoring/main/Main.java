package refactoring.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import SortSample.SortSample;
import refactoring.chap02.FindInt;
import refactoring.chap02.simpleDatabase.SimpleDatabase;
import refactoring.chap04.Label;
import refactoring.chap04.Person;

public class Main {
	public static void main(String[] args) {
	/*	FindInt();
		SimpleDatabase();

		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
*/
		PersonLabel();
	}

	private static void PersonLabel() {
		Person[]people = {
				new Person(new Label("Alice"),new Label("alice@example.com")),
				new Person(new Label("Bobby"),new Label("Bobby@example.com")),
				new Person(new Label("Chris")),
		};
		for(Person p :people) {
			System.out.println(p.toString());
			p.display();
			System.out.println("");
		}
	}

	private static final Random random = new Random(1234);

	private static void execute(int length) {
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(data.length);
		}

		SortSample sorter = new SortSample(data);
		System.out.println("BEFORE:" + sorter);

		sorter.sort();
		System.out.println("AFTER:" + sorter);
		System.out.println();
	}

	private static void SimpleDatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY:\"" + key + "\"");
				System.out.println("VALUE:\"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void FindInt() {
		int[] date = { 1, 9, 0, 2, 8, 5, 6, 3, 4, 7, };
		if (FindInt.find(date, 8)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found....");
		}
	}
}
