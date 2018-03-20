package refactoring.main;

import refactoring.chap02.FindInt;

public class Main {
 public static void main(String[]args) {
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
