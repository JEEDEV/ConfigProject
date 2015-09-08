import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class GetPropertyValues {

	String result = "";
	InputStream inputStream;
 
	static Logger log = Logger.getLogger(GetPropertyValues.class.getName());
	
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			
 
			// get the property value and print it out

			String login = prop.getProperty("login");
			String password = prop.getProperty("password");

 
			log.setLevel(Level.INFO);
			result = "login = " + login ;
			log.info(result);
			result = "password= " + password ;
			log.info(result);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
