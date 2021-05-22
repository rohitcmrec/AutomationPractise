package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signbtn;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="search_query_top")
	private WebElement searchbox;
	
	@FindBy(name="submit_search")
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signbtnclick(String usrname, String passwrd )
	{
		signbtn.click();
		username.sendKeys(usrname);
		password.sendKeys(passwrd);
	}
	
	public void searchproduct(String product)
	{
		searchbox.sendKeys(product);
	}
	
	public void submitbtnclick()
	{
		submitbtn.click();
	}
}
