package Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("./config/settings.properties");
		
		p.load(fis);
		
		String b = p.getProperty("browser");
		
		System.out.println(b);
	}
}
