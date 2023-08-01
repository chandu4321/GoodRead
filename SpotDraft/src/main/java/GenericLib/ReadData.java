package GenericLib;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadData {

	public static String fromPropertyFile(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/url.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
	}

}