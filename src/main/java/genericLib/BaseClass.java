package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Autoconstant {
	
	public WebDriver driver;
	
	public Propertiesfiledata pd = new Propertiesfiledata();
	Photo ph =new Photo();
	public Utilities u = new Utilities();
	
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException 
	{
		System.setProperty(key,value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(pd.getpropertiesdata("url"));
	}
	
	@AfterMethod
	public void close(ITestResult r) throws IOException
	{
		int status = r.getStatus();
		String name = r.getName();
		
		if(status==2)
		{
			ph.takephoto(driver,name);
		}
		driver.quit();
	}
}