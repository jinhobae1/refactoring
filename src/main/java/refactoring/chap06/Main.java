package refactoring.chap06;

public class Main {

	public static void main(String[] args) {
		Book refactoring = new Book(
				"Refactoring:improving the desing of existing code",
				"ISBN0201485672",
				"$44.95",
				"Martin Fowler",
				"fowler@acm.org");
		
		Book math = new Book(
				"���α׷��� ����",
				"ISBN4797329734",
				"20000��",
				"��Ű ���ν�",
				"hyuki@hyuki.com");
		
		System.out.println("refactoring:");
		System.out.println(refactoring.toXml());
		
		System.out.println("math:");
		System.out.println(math.toXml());
				
	}

}
