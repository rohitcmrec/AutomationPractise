package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfiledata implements Autoconstant {
	
	public String getpropertiesdata(String keys) throws FileNotFoundException, IOException
	{
	Properties p = new Properties();
	p.load(new FileInputStream(propertiesfilepath));
	return p.getProperty(keys);

}
}