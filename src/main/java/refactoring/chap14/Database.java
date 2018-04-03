package refactoring.chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Database {
	private final Properties properties;
	private final String filename;

	public Database(String filenames) {
		filename = filenames;
		properties = new Properties();
		try {
			properties.load(new FileInputStream(filename));
		} catch (IOException ignore) {
			// TODO: handle exception
		}
	}

	public void set(String key, String value) {
		properties.setProperty(key, value);
	}

	public String get(String key) {
		return properties.getProperty(key, null);
	}

	public void update() throws IOException {
		properties.store(new FileOutputStream(filename), "");
	}

	public Enumeration keys() {
		return properties.propertyNames();
	}
}
