package github.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		OutputStream os = new FileOutputStream("app.properties");
		prop.setProperty("port", "80");
		prop.setProperty("url", "config");
		prop.store(os, null);
		
		InputStream is = new FileInputStream("app.properties");
		prop.load(is);
		System.out.println(prop.getProperty("url"));
		prop.list(System.out);
	}
}
