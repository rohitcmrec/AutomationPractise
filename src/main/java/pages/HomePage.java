package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="selectProductSort")
	private WebElement dropdwon;
	
	@FindBy(xpath="(//a[@title=\"Printed Chiffon Dress\"])[2]")
	private WebElement finaldress;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDropdwon() {
		return dropdwon;
	}
	
	public void finaldressclick()
	{
		finaldress.click();
	}

}
