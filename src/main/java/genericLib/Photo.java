package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	
	public void takephoto(WebDriver driver, String name) throws IOException
	{
		Date dt = new Date();
		String date = dt.toString().replaceAll("-", ":");
		
		TakesScreenshot photos = (TakesScreenshot) driver;
		File src = photos.getScreenshotAs(OutputType.FILE);
		File dest = new File(Autoconstant.photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
