package genericLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void framehandle(WebDriver driver, int i)
	{
		driver.switchTo().frame(i);
	}
	
	public void alertPopup(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void scrollBar(WebDriver driver, int x, int y) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
}
