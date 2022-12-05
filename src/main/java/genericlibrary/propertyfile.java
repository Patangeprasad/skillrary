package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
	
	public String getproprtydata(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fls=new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fls);
		return p.getProperty(key);
		
		
	}
}
