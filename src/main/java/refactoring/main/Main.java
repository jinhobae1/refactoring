package refactoring.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring.chap02.FindInt;
import refactoring.chap02.simpleDatabase.SimpleDatabase;

public class Main {
 public static void main(String[]args) {
	 FindInt();
	 SimpleDatabase();
	 
 }

private static void SimpleDatabase() {
	try {
		 String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
		 SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
		 Iterator<String>it = db.iterator();
		 while(it.hasNext()) {
			 String key = it.next();
			 System.out.println("KEY:\""+key+"\"");
			 System.out.println("VALUE:\""+db.getValue(key)+"\"");
			 System.out.println();
		 }
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
}

private static void FindInt() {
	int[]date = {
			 1,9,0,2,8,5,6,3,4,7,
	 };
	 if(FindInt.find(date, 8)) {
		 System.out.println("Found!");
	 }else {
		 System.out.println("Not Found....");
	 }
}
}
