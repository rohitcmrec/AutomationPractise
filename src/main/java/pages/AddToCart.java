package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	@FindBy(xpath="//*[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement ddsize;
	
	@FindBy(name="Green")
	private WebElement coloroption;
	
	@FindBy(xpath="//span[text()=\"Add to cart\"]")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//a[@title=\"Proceed to checkout\"]")
	private WebElement proceedtocheckoutbtn;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void plusbtnclick()
	{
		plusbtn.click();
	}
	public WebElement getddsize() {
		return ddsize;
	}
	
	public void coloroptionclick()
	{
		coloroption.click();
	}
	
	public void addtocartbtnclick()
	{
		addtocartbtn.click();
	}
	
	public void ptcheckoutclick()
	{
		proceedtocheckoutbtn.click();
	}
}
