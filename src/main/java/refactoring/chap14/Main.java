package refactoring.chap14;

import java.io.IOException;
import java.util.Enumeration;

public class Main {
	public static void main(String[] args) {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.set("Hiroshi yuki","hyuki@example.com");
			file.set("Hiroshi yuki2","hyuki2@example.com");
			file.set("Hiroshi yuki3","hyuki3@example.com");
			file.update();
			
			Enumeration e = file.names();
			while(e.hasMoreElements()) {
				String name = (String)e.nextElement();
				String mail = file.get(name);
				System.out.println("name"+name+",mail="+mail);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	}

}
